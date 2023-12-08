package Seminar2;

import java.util.Arrays;

//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class TaskDZ1 {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        String params = PARAMS.replace("{", "").replace("}", "").replace("\"", "");

        String name = params.split(",")[0].split(":")[1].trim();
        String country = params.split(",")[1].split(":")[1].trim();
        String city = params.split(",")[2].split(":")[1].trim();
        String age = params.split(",")[3].split(":")[1].trim();
        StringBuilder builder = new StringBuilder(QUERY);

        if(!name.equals("null")){
            builder.append("name=").append("'").append(name).append("'");
            builder.append(" and");
        }
        if(!country.equals("null")){
            builder.append(" country=").append("'").append(country).append("'");
            builder.append(" and");
        }
        if(!city.equals("null")){
            builder.append(" city=").append("'").append(city).append("'");
        }
        if(!age.equals("null")){
            builder.append(" age").append("'").append(age).append("'");
        }
        System.out.println(builder);
    }
}

