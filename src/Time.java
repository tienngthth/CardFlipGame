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

public class Time {
    private int minutes = 2;
    private int seconds = 0;
    private int hundredthOfSeconds = 0;
    private int longestTime = 3;

    //reset the time to 2 minutes
    public  void resetTime() {
        minutes = 2;
        seconds = 0;
        hundredthOfSeconds = 0;
    }

    //decrease the time by 1 hundredth of second
    public String countDownTime() {
        if (seconds + minutes + hundredthOfSeconds == 0) {
        } else if (seconds == 0 && hundredthOfSeconds == 0) {
            --minutes;
            seconds = 59;
            hundredthOfSeconds = 99;
        } else if (hundredthOfSeconds == 0) {
            --seconds;
            hundredthOfSeconds = 99;
        } else {
            --hundredthOfSeconds;
        }
        return getTime();
    }

    //get the time (as text) to display
    public String getTime() {
        String textMinute = "0" + minutes;
        String textSecond = (seconds < 10) ? ("0" + seconds) : Integer.toString(seconds);
        String textHundredOfSecond  = (hundredthOfSeconds < 10) ? ("0" + hundredthOfSeconds) : Integer.toString(hundredthOfSeconds);
        return textMinute + " : " + textSecond + " : " + textHundredOfSecond;
    }

    //return the second left (equal to score for that game) after the user has matches all pairs of photos
    public int getSecondsLeft() {
        if (getTime().equals("00 : 00 : 00")) {
            return 0;
        } else {
            //because the time is displayed in minutes : seconds : hundredOfSeconds so the second drops at the beginning not the end of that second.
            return minutes * 60 + seconds + 1;
        }
    }

    //get the duration of time each photo turns up
    public int getCardUpTime(int level) {
        return longestTime - level + 1;
    }
}
