package ExceptionPractice;

public class Main {
    private final boolean just = true;

    // throws: 던지다(=예외를 던지다 / 발생시키다)
    public void thisMethodIsDangerous() throws BadException{
        if (just){
            throw new BadException();
        }
    }
}
