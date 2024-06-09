package exception;

public class CantHaveMoreThanTwoException extends Exception {

  public CantHaveMoreThanTwoException(final String message, final Throwable error) {
    super(message, error);
  }

  public CantHaveMoreThanTwoException(final String message) {
    super(message);
  }

  public CantHaveMoreThanTwoException(final Throwable error) {
    super(error);
  }

  public CantHaveMoreThanTwoException() {
    super();
  }  

}
