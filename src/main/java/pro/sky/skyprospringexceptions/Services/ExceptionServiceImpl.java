package pro.sky.skyprospringexceptions.Services;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringexceptions.Services.ExceptionService;
import pro.sky.skyprospringexceptions.exceptions.WrongLoginException;
import pro.sky.skyprospringexceptions.exceptions.WrongPasswordException;

@Service
public class ExceptionServiceImpl implements ExceptionService {
    public static void method1(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("\\w+")) {
            throw new WrongLoginException("Wrong login");
        }

        if (password.length() > 20 || !password.matches("\\w+")
                || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password");
        }


    }
}
