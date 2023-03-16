package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.cdac.model.Card;
import com.cdac.model.Team;
import com.cdac.model.User;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
	@Autowired
	JavaMailSender javaMailSender;

	public void sendMail(String to, String name, Integer otp) {
		try {
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setFrom("creditcardcomparehelp@gmail.com");
			helper.setTo(to);
			helper.setSubject("CreditCardCompare password reset OTP");
			helper.setText("Hi, "+name+" \n"+"Your OTP for reset password is : "+otp+"\n"+"\n"+"\n"+"\n"+"\n"
					+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"Thanks,"+"\n"+"The CreditCardCompare Team");
			
			javaMailSender.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendMainRegisterTeam(Team team) {
		try {
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setFrom("creditcardcomparehelp@gmail.com");
			helper.setTo(team.getEmail());
			helper.setSubject("Thanks for Join");
			helper.setText("Hi, "+team.getFullName()+" \n"+"Thank you for join at CreditCardCompare\n"+
					"\nYou are just one step away from being a Verified\nPlease wait for some time..."+
					"\n"+"\n"+"\n"+"\n"+"\n"
					+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"Thanks,"+"\n"+"Team CreditCardCompare");
			
			javaMailSender.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void sendMailAcceptTeam(Team team) {
		try {
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setFrom("creditcardcomparehelp@gmail.com");
			helper.setTo(team.getEmail());
			helper.setSubject("Thanks for Join");
			helper.setText("Hi, "+team.getFullName()+" \n"+"Thank you for join at CreditCardCompare\n"+
					"\nAccount verified.\nNow You can login.. \n\nYour Id : "+team.getUserId()+"\n"+
					"Your password : "+team.getPassword()+
					"\n"+"\n"+"\n"+"\n"+"\n"
					+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"Thanks,"+"\n"+"Team CreditCardCompare");
			
			javaMailSender.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendEmailRegisterUser(User user) {
		try {
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setFrom("creditcardcomparehelp@gmail.com");
			helper.setTo(user.getEmail());
			helper.setSubject("Thanks for Join");
			helper.setText("Hi, "+user.getFullName()+" \n"+"Thank you for join at CreditCardCompare\n"
					+"If add a new Card So notify you"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+
					"\n"+"\n"+"Thanks,"+"\n"+"Team CreditCardCompare");
			
			javaMailSender.send(message);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
	//send main for all user
	public void sendEmailAllUser(String[] list,Card card) {
		try {
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message);
			helper.setFrom("creditcardcomparehelp@gmail.com");
			helper.setTo(list);
			helper.setSubject("Thanks for Join");
			helper.setText("Hi, User"+" \n"+"Thank you for join at CreditCardCompare\n"
					+"Please check out my site.."+"\n"+
					"Add a New card \nBank Name : "+card.getBank().getBankName()+"\nCard Name : "+card.getCardName()
					+"\nCard Category : "+card.getCategory().getCategoryName()
					+"\n"+"\nVisit for more details"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+
					"\n"+"\n"+"Thanks,"+"\n"+"Team CreditCardCompare");
			
			javaMailSender.send(message);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}
