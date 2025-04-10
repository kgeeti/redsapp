package br.eti.kge.redsapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author kge
 */
public class Pedido {

    UUID id;
    Cliente cliente;
    List<ItemPedido> itemList = new ArrayList<>();
    
}
