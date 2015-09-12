/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.almasb.fxgl.asset;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Represents a long-term audio in mp3 file. Use for
 * background (looping) music or recorded dialogues.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public final class Music {

    /*package-private*/ final MediaPlayer mediaPlayer;

    /*package-private*/ Music(Media media) {
        mediaPlayer = new MediaPlayer(media);
    }

    public void setBalance(double balance) {
        mediaPlayer.setBalance(balance);
    }

    public double getBalance() {
        return mediaPlayer.getBalance();
    }

    public void setRate(double rate) {
        mediaPlayer.setRate(rate);
    }

    public double getRate() {
        return mediaPlayer.getRate();
    }

    public void setCycleCount(int count) {
        mediaPlayer.setCycleCount(count);
    }

    public double getCycleCount() {
        return mediaPlayer.getCycleCount();
    }
}
