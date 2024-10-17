package com.hotel.demo.repository;


import com.hotel.demo.entity.Reservation;
import com.hotel.demo.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation , Long> {

    Reservation findByGuestName(String guestName);

    @Query("")
    List<Room> findByType(String type);



}
//
//RoomRepository için Özel Sorgular
//Oda numarasına göre oda bulma:

////Sorgu: Hangi oda numarası ile sorgulamak istersiniz?
//Oda tipine göre odaları bulma:

//Sorgu: Hangi oda tipine göre (örneğin: Single, Double, Suite) odaları listelemek istersiniz?
//Uygun odaları listeleme:

////Sorgu: Oda uygunluğunu kontrol etmek için bir durum (boolean) belirtin mi?
//Gecelik fiyat aralığına göre odaları bulma:

//: Hangi fiyat aralığına göre odaları sorgulamak istersiniz? (minimum ve maksimum fiyat)


//