package com.aps.clinica.odonto.negocio.recepcionista;

import com.aps.clinica.odonto.negocio.conta.CadastroConta;
import com.aps.clinica.odonto.negocio.conta.Conta;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Component
public class ControladorRegRecepcionista {

    @Autowired
    private CadastroRecepcionista cadastroRecepcionista;

    @Autowired
    private CadastroConta cadastroConta;

    public void novoRecepcionista(Recepcionista recepcionista){
        cadastroRecepcionista.novoRecepcionista(recepcionista);
    }

    public void criarConta(Recepcionista recepcionista){
        gerarCredenciais(recepcionista);
    }

    public void enviarCredenciais(Conta conta) throws IOException {
        enviarEmail(conta);
    }

    private void gerarCredenciais(Recepcionista recepcionista){
        Conta conta = new Conta(null, recepcionista, "abcdE123");
        recepcionista.setConta(conta); // Associa uma conta ao recepcionista
        cadastroConta.novaConta(conta); // Cadastra a conta do recepcionista no sistema
    }

    private void enviarEmail(Conta conta) throws IOException {
        Email from = new Email(System.getenv("EMAIL_FROM"));
        Email to = new Email(conta.getRecepcionista().getEmail()); // Envia o email baseado na conta

        // Título e Corpo do email
        String subject = "Análise e Projeto de Sistemas";
        Content content = new Content(
                "text/html", "Olá, "
                + conta.getRecepcionista().getNome() +
                " sua senha para acessar o sistema da clínica é " +
                conta.getSenha() +
                " .Altere sua senha assim que possível.");

        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_KEY"));
        Request request = new Request();

        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());

        Response response = sg.api(request);

        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
    }

}
