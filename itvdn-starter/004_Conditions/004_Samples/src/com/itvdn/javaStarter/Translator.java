package com.itvdn.javaStarter;

import java.util.Scanner;

public class Translator {

    public static void main(String[] args) {
        String str = "Введите слово о погоде:";
        System.out.println(str);
        Scanner input = new Scanner(System.in);
        String buffer1 = input.next();// ввод с клавиатуры только одного слова

        switch (buffer1) {
            case ("осадки"): {
                System.out.println("rainfall");
                break;
            }
            case ("дождь"): {
                System.out.println("rain");
                break;
            }
            case ("ливень"): {
                System.out.println("shower");
                break;
            }
            case ("лужа"): {
                System.out.println("puddle");
                break;
            }
            case ("слякоть"): {
                System.out.println("mud");
                break;
            }
            case ("радуга"): {
                System.out.println("rainbow");
                break;
            }
            case ("солнечно"): {
                System.out.println("sunny");
                break;
            }
            case ("ветренно"): {
                System.out.println("windy");
                break;
            }
            case ("холодно"): {
                System.out.println("сold");
                break;
            }
            case ("тепло"): {
                System.out.println("warm");
                break;
            }
            case ("прохладно"): {
                System.out.println("cool");
                break;
            }
            case ("морозно"): {
                System.out.println("frosty");
                break;
            }
            case ("ясно"): {
                System.out.println("clear");
                break;
            }
            case ("облачно"): {
                System.out.println("cloudy");
                break;
            }
            case ("пасмурно"): {
                System.out.println("gloomy");
                break;
            }
            case ("сухо"): {
                System.out.println("dry");
                break;
            }
            case ("сыро"): {
                System.out.println("wet");
                break;
            }
            case ("влажно"): {
                System.out.println("humid");
                break;
            }
            case ("туманно"): {
                System.out.println("foggy");
                break;
            }
            case ("гром"): {
                System.out.println("thunder");
                break;
            }
            case ("молния"): {
                System.out.println("lightning");
                break;
            }
            case ("наводнение"): {
                System.out.println("flood");
                break;
            }
            case ("засуха"): {
                System.out.println("drought");
                break;
            }
            case ("ураган"): {
                System.out.println("hurricane");
                break;
            }
            case ("снежинка"): {
                System.out.println("snowflake");
                break;
            }
            case ("гроза"): {
                System.out.println("thunderstorm");
                break;
            }
            case ("туман"): {
                System.out.println("hazy");
                break;
            }

            default: System.out.println("Этого слова нет!");


        }

    }
}