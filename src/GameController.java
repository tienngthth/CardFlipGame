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

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javafx.scene.Node;

public class GameController {
    @FXML
    private Button musicOnBtn, musicOffBtn, startNewGameBtn;
    @FXML
    private VBox setUpInterface, restartBox, winBox;
    @FXML
    private GridPane upCardGrid, downCardGrid;
    @FXML
    private StackPane cardGrid, confirmQuitBox;
    @FXML
    private Label timer, gameScore, loseBox, scoreResult;
    @FXML
    private ProgressBar timeProgress;
    @FXML
    private Slider gameLevelSlider;
    @FXML
    private ImageView quitGameImg, inGameImg, startGameImg;
    @FXML
    private HBox scoreBox;
    @FXML
    private ToggleButton animalToggleBtn, U22ToggleBtn;

    private GameModel model = new GameModel();
    private GameView view = new GameView();
    private Timeline textTimeline = new Timeline();
    private Timeline barTimeline = new Timeline();
    private PauseTransition[] pause = new PauseTransition[2];

    //notify the U22 theme is selected
    public void U22Selected(ActionEvent event) {
        getSelectedThemeBtn();
    }

    //notify the animals theme is selected
    public void animalsSelected(ActionEvent event) {
        getSelectedThemeBtn();
    }

    //notify the theme that has been selected
    private void getSelectedThemeBtn() {
        if (animalToggleBtn.isSelected()) {
            view.animalsSelected(animalToggleBtn, U22ToggleBtn);
        } else {
            view.U22Selected(animalToggleBtn, U22ToggleBtn);
        }
    }

    //get to in game interface for the first game
    public void startNewGame(ActionEvent event) {
        String theme = animalToggleBtn.isSelected() ? "animals" : "U22cards";
        view.newGame(quitGameImg, inGameImg, startGameImg, startNewGameBtn, setUpInterface, restartBox, downCardGrid, upCardGrid, model.getCardsNumber(), theme);
        timeCountDown();
    }

    //get to in game interface for the later games when press restart
    public void restartGame(ActionEvent event) {
        String theme = animalToggleBtn.isSelected() ? "animals" : "U22cards";
        view.restartGame(quitGameImg, inGameImg, cardGrid, setUpInterface, downCardGrid, upCardGrid, model.getCardsNumber(), theme);
        timeCountDown();
    }

    //visualize time counting down
    private void timeCountDown() {
        barCountDown();
        textCountDown();
    }

    //change the text according to the time
    private void textCountDown() {
        textTimeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1.0/100), e -> countDownText(timer)));
        textTimeline.setCycleCount(textTimeline.INDEFINITE);
        textTimeline.playFromStart();
    }

    //display time counted down text
    private void countDownText(Label timer) {
        if (model.getTime().equals("00 : 00 : 00")) {
            loseGame();
        } else {
            view.setTimerText(model.countDownText(), timer);
        }
    }

    //change the bar progress according to the time
    private void barCountDown() {
        barTimeline.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO, new KeyValue(timeProgress.progressProperty(), 1)),
                new KeyFrame(Duration.minutes(2), new KeyValue(timeProgress.progressProperty(), 0))
        );
        barTimeline.setCycleCount(1);
        barTimeline.playFromStart();
    }

    //turn on sound
    public void playSound(ActionEvent event) {
        view.soundOn(musicOffBtn, musicOnBtn);
    }

    //turn off sound
    public void muteSound(ActionEvent event) {
        view.soundOff(musicOffBtn, musicOnBtn);
    }

    //check clicked card
    public void cardFlip(MouseEvent event) {
        if (validCardClicked(event)) {
            checkingCards(model.getNewestCardPickedIndex());
        }
    }

    //check if the clicked card is valid to turn up
    private boolean validCardClicked(MouseEvent event) {
        //clicked is valid if pressed and release in the place (not moving cursor)
        if (event.isStillSincePress()) {
            Node clickedNode = (Node) event.getPickResult().getIntersectedNode();
            Integer column = GridPane.getColumnIndex(clickedNode);
            Integer row = GridPane.getRowIndex(clickedNode);
            if (column != null && row != null && model.getNumberOfCardPicked() < 2) {
                model.addCardPicked(row*5 + column);
                return true;
            }
        }
        return false;
    }

    //checking turned up picked cards
    private void checkingCards(int index) {
        int time = model.getCardUpTime((int) gameLevelSlider.getValue());
        view.openCard(downCardGrid, index);
        if (model.getNumberOfCardPicked() == 1) {
            waitingTime(time, index);
        } else if (model.getNumberOfCardPicked() == 2) {
            //stop waiting time of first picked card
            pause[0].stop();
            //turn down cards if not matched
            if (!model.checkMatchedCard()) {
                closeCard(model.getPickedCard().get(0));
                closeCard(model.getPickedCard().get(1));
            } else if (model.getNumberOfMatchedCards() == 10) {
                //win game if match all pairs
                winGame();
                model.emptyCardPicked();
            } else {
                model.emptyCardPicked();
            }
        }
    }

    //set time a card turn up according to level
    private void waitingTime(int time, int index) {
        pause[0] = new PauseTransition(Duration.seconds(time));
        pause[0].setOnFinished(e -> closeCard(index));
        pause[0].play();
    }

    //turn a card down
    private void closeCard(int index) {
        //let 0.5 seconds pause so that the user can actually see the card turning up
        pause[1] = new PauseTransition(Duration.seconds(0.5));
        pause[1].setOnFinished(e -> {view.closeCard(downCardGrid, index);
                                     model.emptyCardPicked();});
        pause[1].play();
    }

    //display lose game interface
    private void loseGame() {
        view.loseGame(cardGrid, setUpInterface, gameScore, model.getNewScore(), winBox, loseBox, scoreBox);
        endGame();
    }

    //display win game interface
    private void winGame() {
        view.winGame(cardGrid, setUpInterface, gameScore, model.getNewScore(), winBox, loseBox, scoreResult, scoreBox, model.getGainScore());
        endGame();
    }

    //display end game interface
    private void endGame() {
        textTimeline.stop();
        textTimeline.getKeyFrames().clear();
        barTimeline.stop();
        barTimeline.getKeyFrames().clear();
        model.resetMatchedCards();
        model.resetTime();
    }

    //back to end game interface
    public void continueGame(ActionEvent event) {
         view.continueGame(setUpInterface, confirmQuitBox);
    }

    //display confirm box
    public void confirmQuitGame(ActionEvent event) {
        view.confirmQuitGame(confirmQuitBox);
    }

    public void quitGame(ActionEvent event) {
        Platform.exit();
    }
}
