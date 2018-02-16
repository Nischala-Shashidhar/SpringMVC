package com.cts.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.cts.model.User;

@Component
public class UserValidator implements Validator {

	public boolean supports(Class clazz) {
		return User.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName",
				"required.user.first.Name", "* User First name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNumber",
				"required.user.contact.Number",
				"* User Contact Number Required");

		User user = (User) target;

		String ascFstName = user.getFirstName();

		if (!errors.hasFieldErrors("firstName")) {
			if (!StringUtils.isAlphaSpace(ascFstName)) {
				errors.rejectValue("firstName",
						"required.firstName.special.char.notAllowed",
						"* User name should not have special characters");
			}
		}
	}
}
