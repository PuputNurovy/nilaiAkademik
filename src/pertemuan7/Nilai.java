package pertemuan7;

public class Nilai {

	private Mahasiswa mhs;
	private MataKuliah mk;
	private double nilai;
	
	public Nilai(){
		
	}
	
	public Nilai(Mahasiswa mhs, MataKuliah mk, double nilai) {
		this.mhs = mhs;
		this.mk = mk;
		this.nilai = nilai;
	}

	public Mahasiswa getMhs() {
		return mhs;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}

	public MataKuliah getMk() {
		return mk;
	}

	public void setMk(MataKuliah mk) {
		this.mk = mk;
	}

	public double getNilai() {
		return nilai;
	}

	public void setNilai(double nilai) {
		this.nilai = nilai;
	}
	
	public String toString(){
		return mhs.getNrp()+" - "+mk.getIdMatkul()+" - "+nilai;
	}
	
	
}
