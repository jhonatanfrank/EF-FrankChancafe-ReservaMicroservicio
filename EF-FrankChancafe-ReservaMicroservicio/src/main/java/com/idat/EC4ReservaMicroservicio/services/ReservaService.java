package com.idat.EC4ReservaMicroservicio.services;

import java.util.List;

import com.idat.EC4ReservaMicroservicio.dto.ReservaDTO;

public interface ReservaService {
  List<ReservaDTO> listar();
  void guardar(ReservaDTO reserva);
}
