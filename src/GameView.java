/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2019C
  Assessment: Assignment 2
  Author: Nguyen Thi Thuy Tien
  ID: s3757934
  Created  date: 9/12/2019
  Last modified: 16/12/2019
  Acknowledgement:
  T.Phạm, "Lấy vàng SEA Games 30, 11 cầu thủ "hot" nhất U22 Việt Nam viết gì trên Facebook?", December 11, 2019. Available: "https://www.24h.com.vn/cong-nghe-thong-tin/lay-vang-sea-games-30-11-cau-thu-hot-nhat-u22-viet-nam-viet-gi-tren-facebook-c55a1107519.html"
  T.Nhi, "'Linh phá đội', 'Toản bánh bao' và biệt danh của cầu thủ U22 Việt Nam", December 7, 2019. Available: "https://news.zing.vn/linh-pha-doi-toan-banh-bao-va-biet-danh-cua-cau-thu-u22-viet-nam-post1022089.html"
  T.Nhi, "Văn Hậu, Văn Toản và các cầu thủ hơn 1,80 m của U22 Việt Nam", December 5, 2019. Available: "https://news.zing.vn/van-hau-van-toan-va-cac-cau-thu-hon-1-80-m-cua-u22-viet-nam-post1021386.html"
  Available: "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=nPnWBNcFh3sbgM:"
  Available: "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=3wT4sfK0bfy5_M:"
  Available:  "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=Hg0Yc_JuqQ5cHM:"
  Available: "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=8UrEHkKlaZwfbM:"
  Available: "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=7iiXQyglplf2GM:"
  Available: "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=Yyl_tCobFWMi5M:"
  Available: "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=nhIUKvI6gp_7nM:"
  Available: "https://www.google.com/search?biw=1366&bih=614&tbm=isch&sa=1&ei=jUn2XaC5EteY4-EPyqC7qAI&q=animals+hd&oq=animals+hd&gs_l=img.3..0l10.68226.69170..69386...1.0..0.80.451.6......0....1..gws-wiz-img.......0i67.n-cIdKCxXxg&ved=0ahUKEwjgs8He9LfmAhVXzDgGHUrQDiUQ4dUDCAc&uact=5#imgrc=lw2XqUkvWxQTnM:"
  Available: "https://www.google.com/search?sa=G&hl=en-VN&q=zebra+oreo&tbm=isch&source=iu&ictx=1&tbs=simg:CAESmgIJe7zJ-MYARJwajgILELCMpwgaYgpgCAMSKJkH6BLLAqcHkxKvB8wCpR2nHY0GuTeSJO83nCfgNPMs-zmRKaE3gzUaMLEewnHn2FLd01iZcKQfEZBwLSAXnTZOQF81w97UUNS0JAAc2lBJYOVEs7O1sIu2EyAEDAsQjq7-CBoKCggIARIEod8xiQwLEJ3twQkahgEKFwoFemVicmHapYj2AwoKCC9tLzA4OThiChoKB2dyYXppbmfapYj2AwsKCS9tLzAzaGgyawoZCgZzYWZhcmnapYj2AwsKCS9tLzAxOTliMAoYCgVncmFzc9qliPYDCwoJL20vMDh0OWNfChoKB3NhdmFubmHapYj2AwsKCS9tLzAxYzdkMww&fir=s5Ah6MdpkKLEsM%253A%252Ce0KYp3xiPV-j2M%252C_&vet=1&usg=AI4_-kRPLDxYEPjwtovaISXBKHndiUaXpw&ved=2ahUKEwik077blrrmAhWLOnAKHZsFAHUQ9QEwAnoECAEQBA#imgrc=s5Ah6MdpkKLEsM:"
  Available: "https://www.google.com/imgres?imgurl=https://zoo.sandiegozoo.org/sites/default/files/styles/landing_page_view_thumbnail/public/2019-01/thumb-amurleopard_0.jpg%3Fitok%3D2V5hBqxr&imgrefurl=https://pixlcorps.com/info/animal-pictures&h=540&w=668&tbnid=1Z2eb-yIs2UVHM&tbnh=202&tbnw=250&usg=K_7zNEXOlHRdg1QQtf30mjb6wwQzo=&hl=en-VN&docid=gOOFMk57YY4rJM&itg=1"
*/

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class GameView {
    private MediaPlayer sound;
    private ImageView[] upCards = new ImageView[20];
    private ImageView[] downCards = new ImageView[20];

    public GameView () {
        setMediaPlayer();
    }

    //set music for game
    private void setMediaPlayer() {
        String musicFile = "src/backgroundMusic.mp3";
        Media music = new Media(new File(musicFile).toURI().toString());
        sound = new MediaPlayer(music);
        sound.play();
    }

    //notify the U22 theme is selected
    public void U22Selected(ToggleButton animalToggleBtn, ToggleButton U22ToggleBtn) {
        U22ToggleBtn.setStyle("-fx-border-color : blue;" +
                                 "-fx-border-width : 1.5;");
        animalToggleBtn.setStyle("-fx-border-color : white;" +
                              "-fx-border-width : 0;");
    }

    //notify the animals theme is selected
    public void animalsSelected(ToggleButton animalToggleBtn, ToggleButton U22ToggleBtn) {
        animalToggleBtn.setStyle("-fx-border-color : blue;" +
                                 "-fx-border-width : 1.5;" +
                "-fx-border-radius : 4;");
        U22ToggleBtn.setStyle("-fx-border-color : white;" +
                              "-fx-border-width : 0;");
    }

    //display in game interface for the first game
    public void newGame(ImageView quitGameImg, ImageView inGameImg, ImageView startGameImg, Button startNewGameBtn, VBox setUpInterface, VBox restartBox, GridPane downCardGrid, GridPane upCardGrid, int[] cardNumber, String theme) {
        startGameImg.setVisible(false);
        startNewGameBtn.setVisible(false);
        restartBox.setVisible(true);
        setUpInterface.setVisible(false);
        setThemeImg(quitGameImg, inGameImg, theme);
        setCards(upCardGrid, downCardGrid, cardNumber, theme);
    }

    //display in game interface for the later games when press restart
    public void restartGame(ImageView quitGameImg, ImageView inGameImg, StackPane cardGrid, VBox setUpInterface, GridPane downCardGrid, GridPane upCardGrid, int[] cardNumber, String theme) {
        cardGrid.setVisible(true);
        setUpInterface.setVisible(false);
        setThemeImg(quitGameImg, inGameImg, theme);
        setCards(upCardGrid, downCardGrid, cardNumber, theme);
    }

    //set card images according to theme
    private void setCards(GridPane upCardGrid, GridPane downCardGrid, int[] cardNumber, String theme) {
        setUpCardGrid(upCardGrid, cardNumber, theme);
        setDownCardGrid(downCardGrid, theme);
    }

    //set front images of the cards according to theme
    private void setUpCardGrid(GridPane upCardGrid, int[] cardNumber, String theme) {
        getUpCards(cardNumber, theme);
        for (int row = 0; row < 4; ++row) {
            for (int column = 0; column < 5; ++column) {
                upCardGrid.add(upCards[row * 5 + column], column, row);
            }
        }
    }

    //get images from file according to theme
    private void getUpCards(int[] cardNumber, String theme) {
        for (int i = 0; i < 20; ++i) {
            upCards[i] = new ImageView("file:" + theme + "/" + Integer.toString(cardNumber[i]) + ".jpg");
            upCards[i].setFitHeight(130.0);
            upCards[i].setFitWidth(130.0);
            upCards[i].setSmooth(true);
        }
    }

    //set back image of the cards according to theme
    private void setDownCardGrid(GridPane downCardGrid, String theme) {
        downCardGrid.getChildren().clear();
        for (int row = 0; row < 4; ++row) {
            for (int column = 0; column < 5; ++column) {
                downCards[row * 5 + column] = new ImageView("file:src/" + theme + "down.jpg");
                downCards[row * 5 + column].setFitHeight(130.0);
                downCards[row * 5 + column].setFitWidth(130.0);
                downCards[row * 5 + column].setSmooth(true);
                downCardGrid.add(downCards[row * 5 + column], column, row);
                downCardGrid.getChildren().get(row * 5 + column).setVisible(true);
            }
        }
    }

    //set theme image
    private void setThemeImg(ImageView quitGameImg, ImageView inGameImg, String theme) {
        Image img = new Image("file:src/" + theme + "theme.jpg");
        quitGameImg.setImage(img);
        inGameImg.setImage(img);
    }

    //turn off sound
    public void soundOff(Button musicOffBtn, Button musicOnBtn) {
        musicOffBtn.setVisible(false);
        musicOnBtn.setVisible(true);
        sound.setMute(true);
    }

    //turn on sound
    public void soundOn(Button musicOffBtn, Button musicOnBtn) {
        musicOnBtn.setVisible(false);
        musicOffBtn.setVisible(true);
        sound.setMute(false);
    }

    //display time
    public void setTimerText(String time, Label timer) {
        timer.setText(time);
    }

    //display win game interface
    public void winGame(StackPane cardGrid, VBox setUpInterface, Label score, String gameScore, VBox winBox, Label loseBox, Label scoreResult, HBox scoreBox, String gainScore) {
        scoreResult.setText(gainScore);
        loseBox.setVisible(false);
        winBox.setVisible(true);
        setUpInterface.setStyle("-fx-padding: 10;" +
                                "-fx-border-style: solid inside;" +
                                "-fx-border-width: 2;" +
                                "-fx-border-radius: 5;" +
                                "-fx-border-color: blue;");
        endGame(cardGrid, setUpInterface, score, gameScore, scoreBox);
    }

    //display lose game interface
    public void loseGame(StackPane cardGrid, VBox setUpInterface, Label score, String gameScore, VBox winBox, Label loseBox, HBox scoreBox) {
        loseBox.setVisible(true);
        winBox.setVisible(false);
        setUpInterface.setStyle("-fx-padding: 10;" +
                                "-fx-border-style: solid inside;" +
                                "-fx-border-width: 2;" +
                                "-fx-border-radius: 5;" +
                                "-fx-border-color: grey;");
        endGame(cardGrid, setUpInterface, score, gameScore, scoreBox);
    }

    //display end game interface
    public void endGame(StackPane cardGrid, VBox setUpInterface, Label score, String gameScore, HBox scoreBox) {
        cardGrid.setVisible(false);
        score.setText(gameScore);
        //notify when user reaches max score
        if (gameScore.equals("MAX 9999")) {
            scoreBox.setStyle("-fx-padding: 2;" +
                              "-fx-border-style: solid inside;" +
                              "-fx-border-width: 1;" +
                              "-fx-border-radius: 5;" +
                              "-fx-border-color: yellow;");
        }
        setUpInterface.setVisible(true);
    }

    //turn down card
    public void closeCard(GridPane downCard, int index) {
        downCard.getChildren().get(index).setVisible(true);
    }

    //turn up card
    public void openCard(GridPane downCard, int index) {
        downCard.getChildren().get(index).setVisible(false);
    }

    //display confirm box
    public void confirmQuitGame(StackPane confirmQuitBox) {
        confirmQuitBox.setVisible(true);
    }

    //back to end game interface box
    public void continueGame(VBox setUpInterFace, StackPane confirmQuitBox) {
        setUpInterFace.setVisible(true);
        confirmQuitBox.setVisible(false);
    }
}
