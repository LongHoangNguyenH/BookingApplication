package com.projectcv.HotelBookingApp.exception;

public class PhotoRetrievalException extends RuntimeException  {
    public PhotoRetrievalException(String errorRetrievingPhoto) {
        super(errorRetrievingPhoto);
    }
}
