package src;

public class Main {

    public static void main(String[] args) {
        try {
            validateLoginPassword("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateLoginPassword(String login, String password,
                                             String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Логин должен быть равен или меньше 20 символов и содержать только буквы, цифры и подчеркивания");
        }

        if (password.length() >= 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов и содержать только буквы, цифры и подчеркивания");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля должны совпадать");
        }
    }
}
