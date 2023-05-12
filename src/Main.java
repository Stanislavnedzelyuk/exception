package src;

public class Main {

    public static void main(String[] args) {
        try { validateLoginPassword("java_skypro_go", "D_1hWiKjjP_9",
                    "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static void validateLoginPassword(String login, String password,
                                             String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20) {
            throw new WrongLoginException("Логин должен быть равен или меньше 20 символов");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля должны совпадать");
        }
    }
}

