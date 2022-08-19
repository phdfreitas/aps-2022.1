package com.aps.clinica.odonto.email;

import com.aps.clinica.odonto.conta.negocio.Conta;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class EnviarEmailAdapter implements IEnviarEmail {

    @Override
    public void enviarEmail(Conta conta) {
        try {
            Email from = new Email(System.getenv("EMAIL_FROM"));
            Email to = new Email(conta.getRecepcionista().getEmail());

            // Título e Corpo do email
            String subject = "Clínica Odontólogica APS";
            Content content = new Content(
                    "text/html", "Olá, "
                    + conta.getRecepcionista().getNome() +
                    " sua senha para acessar o sistema da clínica é " +
                    conta.getSenha() +
                    " .Lembre-se, altere sua senha assim que possível.");

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
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
