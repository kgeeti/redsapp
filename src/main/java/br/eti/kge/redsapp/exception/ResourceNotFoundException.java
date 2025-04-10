package br.eti.kge.redsapp.exception;

/**
 *
 * @author kge
 */
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mensagem) {
        super(mensagem);
    }
}