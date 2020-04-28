package EstruturasII.modelo;
import java.util.List;

public interface Node extends Comparable {

    public List<Node> getNeighbors();
}