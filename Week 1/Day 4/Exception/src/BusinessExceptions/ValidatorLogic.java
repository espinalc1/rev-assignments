package BusinessExceptions;

import java.util.Scanner;

public class ValidatorLogic {
	private BusinessUnChecked busUnCh;
	private BusinessChecked busCh;
	private String pattern;

	private String message;

	public ValidatorLogic(String pattern, String message) {
		super();
		this.busUnCh = setBusUnCh(message);
		this.busCh = setBusCh(message);
		this.pattern = pattern;
		this.message = message;
	}

	// need to add a validator
	public void validateId(String emId) throws BusinessUnChecked {
		if (!emId.matches(this.pattern)) {
			throw this.busUnCh;
		} else {
			System.out.println("Input Validated!\n\n");
		}
	};
	
	public void validateList(String[] emId) throws BusinessChecked {
		for (int i = 0; i < emId.length; i++) {
			if (!emId[i].matches(this.pattern)) {
				throw this.busCh;
			}
		}
	}

	public BusinessUnChecked getBusUnCh() {
		return busUnCh;
	}

	private BusinessUnChecked setBusUnCh(String message) {
		return new BusinessUnChecked(message);
	}

	public BusinessChecked getBusCh() {
		return busCh;
	}

	private BusinessChecked setBusCh(String message) {
		return new BusinessChecked(message);
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
