/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerais;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
public class EnviaEmail {
	public EnviaEmail() throws EmailException, MalformedURLException {
		//enviaEmailSimples();
		enviaEmailComAnexo();
	}
	/**
	 * envia email simples(somente texto)
	 * @throws EmailException
	 */
	public void enviaEmailSimples() throws EmailException {
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com"); // o servidor SMTP para envio do e-mail
		email.addTo("taina.fiegenbaum@universo.univates.br"); //destinatário
		email.setFrom("tainafiegenbaum@gmail.com"); // remetente
		email.setSubject("teste"); // assunto do e-mail
		email.setMsg("teste abc123"); //conteudo do e-mail
		email.setAuthentication("tainafiegenbaum@gmail.com", "20ta02ina");
		email.setSmtpPort(465);
		email.setSSL(true);
		email.setTLS(true);
		email.send();	
	}
	/**
	 * envia email com arquivo anexo
	 * @throws EmailException
	 */
	public void enviaEmailComAnexo() throws EmailException{
		// cria o anexo 1.
		EmailAttachment anexo1 = new EmailAttachment();
		anexo1.setPath("C:/Users/Tainá Fiegenbaum/Documents/UNIVATES/PAA/projeto/src/icons/transp.jpg"); //caminho do arquivo (RAIZ_PROJETO/teste/teste.txt)
		anexo1.setDisposition(EmailAttachment.ATTACHMENT);
		anexo1.setDescription("bla");
		anexo1.setName("dajfhgajds");		
		// cria o anexo 2.
		EmailAttachment anexo2 = new EmailAttachment();
		anexo2.setPath("C:/Users/Tainá Fiegenbaum/Documents/UNIVATES/PAA/projeto/src/icons/lupa.jpg"); //caminho do arquivo (RAIZ_PROJETO/teste/teste2.jsp)
		anexo2.setDisposition(EmailAttachment.ATTACHMENT);
		anexo2.setDescription("teste2");
		anexo2.setName("teste2");		
		// configura o email
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com"); // o servidor SMTP para envio do e-mail
		email.addTo("taina.fiegenbaum@universo.univates.br"); //destinatário
		email.setFrom("tainafiegenbaum@gmail.com"); // remetente
		email.setSubject("Aula PAA"); // assunto do e-mail
		email.setMsg("Teste envio de e-mail de programação de aplicações!"); //conteudo do e-mail
		email.setAuthentication("tainafiegenbaum@gmail.com", "20ta02ina");
		email.setSmtpPort(465);
		email.setSSL(true);
		email.setTLS(true);
		// adiciona arquivo(s) anexo(s)
		email.attach(anexo1);
		email.attach(anexo2);
		// envia o email
		email.send();
	}
	
	public static void main(String[] args) throws EmailException, MalformedURLException {
		new EnviaEmail();
	}
}