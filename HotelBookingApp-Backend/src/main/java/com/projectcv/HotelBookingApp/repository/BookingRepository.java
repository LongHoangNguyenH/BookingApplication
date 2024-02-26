package com.projectcv.HotelBookingApp.repository;

import com.projectcv.HotelBookingApp.model.BookedRoom;
import com.projectcv.HotelBookingApp.response.BookingResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {

    List<BookedRoom> findByRoomId(Long roomId);

    Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> findByGuestEmail(String email);
}
