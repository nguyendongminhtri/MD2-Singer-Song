package rikkei.academy.view;

import rikkei.academy.config.Config;
import rikkei.academy.view.singer.ViewSinger;

public class Main {
    public Main(){
        System.out.println("=========WELCOME ZING MP3 =============");
        System.out.println("1. SINGER MANAGE");
        System.out.println("2.SONG MANAGER");
        int chooseMenu = Config.scanner().nextInt();
        switch (chooseMenu){
            case 1:
                new ViewSinger();
                break;
        }
    }
    public static void main(String[] args) {
       new Main();
    }
}