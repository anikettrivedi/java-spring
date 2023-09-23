package org.example.behavioralpatterns.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    NewsAgency observable = new NewsAgency();
    NewsChannel observer = new NewsChannel();

    @Test
    public void testObserver(){
        observable.addObserver(observer);
        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

}
