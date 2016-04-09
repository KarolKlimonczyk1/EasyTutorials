<!-- ------------contact form ---------------------- -->

	<div id="contact" class="contact" data-ng-controller="ContactForm">
		<form data-ng-submit="sendEmail(message)" class="smart-green">
			<h1>
				Contact Form <span>Please fill all the texts in the fields.</span>
			</h1>
			<label> <span>Your Name :</span> <input
				data-ng-model="message.senderName" placeholder="Firstname Surname"
				type="text" required />
			</label> <label> <span>Your Email :</span> <input
				data-ng-model="message.senderEmail" placeholder="example@gmail.com"
				type="email" required />
			</label> <label> <span>Message :</span> <textarea
					data-ng-model="message.content" placeholder="Your Message to Us"
					required></textarea>
			</label> <label> <span>&nbsp;</span> <input type="submit"
				class="button" value="Send" />
			</label> {{messageSending}}
		</form>

	</div>