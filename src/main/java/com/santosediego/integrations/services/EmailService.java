package com.santosediego.integrations.services;

import com.santosediego.integrations.dto.EmailDTO;

public interface EmailService {

	void sendEmail(EmailDTO dto);
}
