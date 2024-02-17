public class Check {
   
public static void checkDateFormat(String date) throws IncorrectValueException{

    char[] checkData = date.toCharArray();
    if (checkData.length == 10 && (checkData[2] == '.' && checkData[5] == '.')){

    } else {
        throw new IncorrectValueException("Формат даты введен не правильно. Правильный формат ввода данных dd.mm.yyyy");
    }
}

    
    public static void checkPhoneNumberFormat(String phoneNumber) throws IncorrectValueException{
        try {
            long check = Long.parseLong(phoneNumber); // ошибка приведения вида
        } catch (IncorrectValueException e){
            throw new IncorrectValueException("Формат телефона пользователя введен не правильно. " +
                    "Правильный формат ввода данных 111222334455");
        }
    }

   
    public static void checkGenderFormat(String gender) throws IncorrectValueException{
        if (gender.length() == 3){
            gender = gender.toLowerCase();
            if (gender.equals("муж") || gender.equals("жен")) {
                char[] charArray = gender.toCharArray();
                char convertedGender = charArray[0];
            } else {
                throw new IncorrectValueException("Вы непрвльно указали пол !\n" +
                        "Правильный формат ввода данных: муж или жен.");
            }
        } else {
            throw new IncorrectValueException("Вы неправильно указали пол!\n" +
                    "Пол указывается одним символом, если мужчина 'муж', если женщина жен'.\n");
        }
    }
}
