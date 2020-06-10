package main.item;

public class Cd extends Production {

    public static final int SONG_LENGTH = 12;
    public static final String SONG_CAPTION = "曲名";
    public static final int SINGER_LENGTH = 10;
    public static final String SINGER_CAPTION = "歌手";
    public static final String NAME = "CD";

    public boolean setTitle(String title) {
        // BookShelfManagerで入力チェックしているが、ここでも入力チェック
        if(title.length() <= SONG_LENGTH && 0 < title.length()) {
            super.title = title;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setPerson(String person) {
        // BookShelfManagerで入力チェックしているが、ここでも入力チェック
        if(person.length() <= SINGER_LENGTH && 0 < person.length()) {
            super.person = person;
            return true;
        }
        else {
            return false;
        }
    }

}

