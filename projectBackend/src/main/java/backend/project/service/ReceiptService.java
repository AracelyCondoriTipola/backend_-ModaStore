package backend.project.service;

import java.util.List;
import java.util.Optional;

import backend.project.dto.ReceiptDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.project.entity.Receipt;
import backend.project.repository.ReceiptRepository;

@Service

public class ReceiptService {
    @Autowired
    private ReceiptRepository receiptRepository;

    public List<Receipt> BuscarTodos() {
        return (List<Receipt>) receiptRepository.findAll();
    }

    public Optional<Receipt> getById(Integer id) {
        return receiptRepository.findById(id);
    }

    public void guardar(Receipt receipt) {
        receiptRepository.save(receipt);
    }

    public List<ReceiptDto>ObtenerRecibos()
    {
        List<ReceiptDto> list= receiptRepository.ObtenerRecibos();
        list.forEach(l -> System.out.println(l));
        return list;

    }
}
