
package clique_algo;

import java.util.Vector;

/**
 * this class represent a dedicated Clique class which assumes undirected graph and holds 
 * the potential Ni intersection. 
 * @author Boaz
 *
 */
public class Clique {
	private VertexSet _clique;
	private VertexSet _Ni;
	private static Graph _graph = null;
	public static void init(Graph g) { _graph = g;}
	/**
	 * start a clique with an edge: represented by the indeses a,b
	 * @param a: vertex index
	 * @param b: vertex index
	 */
	public Clique(int a, int b){
		_clique = new VertexSet();
		_clique.add(a); _clique.add(b);
		_Ni = _graph.Ni(a).intersection(_graph.Ni(b));
	}
	public Clique(Clique ot){
		_clique = new VertexSet(ot._clique);
		_Ni = new VertexSet(ot._Ni);
	}
	public Clique(Clique ot, int vertex){
		_clique = new VertexSet(ot._clique);
		_Ni = new VertexSet(ot._Ni);
		this.addVertex(vertex);
	}
	public String toFile() {
		StringBuilder ans = new StringBuilder();
		int size=_clique.size();
		for(int i=0;i<size;i++)
		{
			ans.append(_clique.at(i)).append(",");
		return ans.toString;
	}
	public int size() {
		return this._clique.size();
		
	}
	public VertexSet clique() {
		return this._clique;
		
	}
	public int size() {return this._clique.size();}
-	public VertexSet clique() {return this._clique;}
	public void addVertex(int vertex){
		_clique.add(vertex);
		_Ni = _Ni.intersection(_graph.Ni(vertex));
	}
	public VertexSet commonNi() {
		return _Ni;
	}
}
