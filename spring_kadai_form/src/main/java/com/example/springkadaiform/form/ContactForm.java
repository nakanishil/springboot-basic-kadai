package com.example.springkadaiform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ContactForm {
	// 名前
	@NotBlank(message = "ユーザ名を入力してください。")
	private String questioner;
	
	// メールアドレス
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email(message = "正しいメールアドレスを入力してください。")
	private String email;
	
	// お問い合わせ内容
	@NotBlank(message = "お問い合わせ内容を入力してください。")
	private String inquiryDetails;
}
