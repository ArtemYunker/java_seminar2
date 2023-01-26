// // В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";

// Для разбора строки используйте String.split. Сформируйте новую строку,
// используя StringBuilder. Значения null не включаются в запрос.

public class dz {

    public static void main(String[] args) {
        String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}"; 

        String str = s.substring(1,s.length()-1);


        String [] str1 = str.split(",");
        String first = str1[0];
        String [] first1 = first.split(":");

    
        String first_key = first1[0];
        String first_key_finaly = first_key.substring(1,first_key.length()-1);
        String first_value = first1[1];
        String first_value_finaly = first_value.substring(1,first_value.length()-1);



        String second = str1[1];
        String [] second1 = second.split(":");
        String second_key = second1[0];
        String second_key_finaly = second_key.substring(2,second_key.length()-1);
        String second_value = second1[1];
        String second_value_finaly = second_value.substring(1,second_value.length()-1);



        String third= str1[2];
        String [] third1 = third.split(":");
        String third_key = third1[0];
        String third_key_finaly = third_key.substring(2,third_key.length()-1);
        String third_value = third1[1];
        String third_value_finaly = third_value.substring(1,third_value.length()-1);



        String fourth = str1[3];
        String [] fourth1 = fourth.split(":");
        String fourth_key = fourth1[0];
        String fourth_key_finaly = fourth_key.substring(2,fourth_key.length()-1);
        String fourth_value = fourth1[1];
        String fourth_value_finaly = fourth_value.substring(1,fourth_value.length()-1);




        System.out.printf("SELECT * FROM students WHERE %s = %s AND %s = %s  AND %s = %s AND %s = %s ", first_key_finaly,first_value_finaly,
        second_key_finaly,second_value_finaly,third_key_finaly,third_value_finaly, fourth_key_finaly,fourth_value_finaly);

        
  
    }
}
