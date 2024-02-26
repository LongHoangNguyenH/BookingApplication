package com.projectcv.HotelBookingApp.service;

import com.projectcv.HotelBookingApp.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    List<BookedRoom> getAllBookings();

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    void cancelBooking(Long bookingId);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getBookingsByUserEmail(String email);
}
