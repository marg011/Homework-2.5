package pro.sky.skyprospringexceptions.Services;

import pro.sky.skyprospringexceptions.exceptions.WrongLoginException;
import pro.sky.skyprospringexceptions.exceptions.WrongPasswordException;

public interface ExceptionService {
    static void method1(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

    }

}
