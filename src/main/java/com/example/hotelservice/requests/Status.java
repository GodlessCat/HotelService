package com.example.hotelservice.requests;

public enum Status {
    CREATED("Создано"),
    CANCELLED_BY_GUEST("Отменено гостем"),
    CANCELLED_BY_WORKER("Отменено сотрудником"),
    CANCELLED_BY_DISPATCHER("Отменено диспетчером"),
    DONE("Выполнено"),
    ASSIGNED("Назначено");

    private String string;

    Status(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}