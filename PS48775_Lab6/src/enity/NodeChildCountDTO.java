package enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodeChildCountDTO {
	private int node_id;
    private String node_name;
    private int child_count;
}
