package com.wyh.designpattern.enums;

public enum BeanNameEnums {

    PROMOTIONONE("promotion-1", "promotionOne"),

    PROMOTIONTWO("promotion-2", "promotionTwo");

    /**
     * 前台传入code
     * 约定好
     */
    private String promotion;

    /**
     * 需要得到Bean的名称
     */
    private String beanName;

    BeanNameEnums(String promotion, String beanName) {
        this.promotion = promotion;
        this.beanName = beanName;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    /**
     * 通过promotion来获取BeanName
     *
     * @param promotion code值
     * @return beanName
     */
    public static String getBeanNameByPromotion(String promotion) {
        for (BeanNameEnums enums : BeanNameEnums.values()) {
            if (promotion.equals(enums.promotion)) {
                return enums.beanName;
            }
        }
        return null;
    }
}
