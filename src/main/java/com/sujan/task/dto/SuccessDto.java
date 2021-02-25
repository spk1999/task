package com.sujan.task.dto;

public class SuccessDto {

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public SuccessDto(boolean success) {
        this.success = success;
    }

    public SuccessDto() {
    }
}
