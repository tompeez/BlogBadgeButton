package de.hahn.blog.badgebutton;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;


public class BadgeButtonBean {
    private static ADFLogger logger = ADFLogger.createADFLogger(BadgeButtonBean.class);
    public BadgeButtonBean() {
    }

    public void onBadgeButton(ActionEvent actionEvent) {
       logger.info("Test!");
            
    }

    public String onBadgeButtonAction() {
        logger.info("Test5!");
        return null;
    }
}
