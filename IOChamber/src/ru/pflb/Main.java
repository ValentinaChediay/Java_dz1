package ru.pflb;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        if(args.length != 0){
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
                while (bufferedReader.ready()) {
                    list.add(bufferedReader.readLine());
                }
                //for (String string : list) {
                //System.out.println(string);
                //}
                for(int i = 0; i < list.size(); i++){
                    if(i % 2 == 0){
                        System.out.println(list.get(i));
                    }
                }
            } catch (Exception e){
                System.out.println("Файл не распознан. Введите ваши сообщения");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    String s = reader.readLine();
                    if (s.isEmpty()) {
                        break;
                    } else {
                        list.add(s);
                    }
                }
                //for (String string : list) {
                //System.out.println(string);
                //}
                for(int i = 0; i < list.size(); i++){
                    if(i % 2 == 0){
                        System.out.println(list.get(i));
                    }
                }
            }
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) {
                    break;
                } else {
                    list.add(s);
                }
            }
            //for (String string : list) {
            //System.out.println(string);
            //}
            for(int i = 0; i < list.size(); i++){
                if(i % 2 == 0){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
