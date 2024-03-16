package retryexceptiondemo;

public class SBIService {
    int i = 0;

    public String transfer() {
        i = i + 1;
        if (i % 2 == 0) {

            throw new InsufficientFundsException(ErrorCodes.INSUFFICIENT_FUNDS_EXCEPTION_ERROR_CODE.getCode(),
                    ErrorCodes.INSUFFICIENT_FUNDS_EXCEPTION_ERROR_CODE.getMessage());
        }else {
            throw new TimeOutException(ErrorCodes.TimeOutException_ERROR_CODE.getCode(), ErrorCodes.TimeOutException_ERROR_CODE.getMessage());
        }
    }
}