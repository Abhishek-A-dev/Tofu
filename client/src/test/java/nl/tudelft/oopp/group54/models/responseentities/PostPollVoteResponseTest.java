package nl.tudelft.oopp.group54.models.responseentities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostPollVoteResponseTest {

	PostPollVoteResponse response;

	@BeforeEach
	void setUp() {
		Boolean success = true;
		String message = "Success message";

		response = new PostPollVoteResponse();
		response.setSuccess(success);
		response.setMessage(message);
	}

	@Test
	void getSuccess() {
		assertEquals(response.getSuccess(), true);
	}

	@Test
	void getMessage() {
		assertEquals(response.getMessage(), "Success message");
	}
}