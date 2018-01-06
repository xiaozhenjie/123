class Computer{
	private String cpu;
	private String zhuban;
	private int yprl;//Ӳ������
	private long zhuangsu;//ת��
	Computer(){
		cpu="";
		zhuban="";
		yprl=0;
		zhuangsu=0;
	}
	Computer(String cpu,String zhuban,int yprl,long zhuangsu){
		setCpu(cpu);
		setZhuban(zhuban);
		setYprl(yprl);
		setZhuangsu(zhuangsu);
	}
	public void setCpu(String cpu){
		this.cpu=cpu;
	}
	public void setZhuban(String zhuban){
		this.zhuban=zhuban;
	}
	public void setYprl(int yprl){
		this.yprl=yprl;
	}
	public void setZhuangsu(long zhuangsu){
		this.zhuangsu=zhuangsu;
	}
	public String getCpu(){
		return cpu;
	}
	public String getZhuban(){
		return zhuban;
	}
	public int getYprl(){
		return yprl;
	}
	public long getZhuangsu(){
		return zhuangsu;
	}
	public void printComInfo(){
		System.out.println("cpu:"+cpu+",���壺"+zhuban+",Ӳ��������"+yprl+",ת�٣�"+zhuangsu);
	}
}
class Taishi extends Computer{
	private String pinpai;
	private String xianka;
	private String shengka;
	private float jiage;
	Taishi(){
		super();
		pinpai="";
		xianka="";
		shengka="";
		jiage=0f;
	}
	Taishi(String cpu,String zhuban,int yprl,long zhuangsu,String pinpai,String xianka,String shengka,float jiage){
		super.setCpu(cpu);
		super.setZhuban(zhuban);
		super.setYprl(yprl);
		super.setZhuangsu(zhuangsu);
		setPinpai(pinpai);
		setXianka(xianka);
		setShengka(shengka);
		setJiage(jiage);
	}
	public void setPinpai(String pinpai){
		this.pinpai=pinpai;
	}
	public void setXianka(String xianka){
		this.xianka=xianka;
	}
	public void setShengka(String shengka){
		this.shengka=shengka;
	}
	public void setJiage(float jiage){
		this.jiage=jiage;
	}
	public String getPinpai(){
		return pinpai;
	}
	public String getXianka(){
		return xianka;
	}
	public String getShengka(){
		return shengka;
	}
	public float getJiage(){
		return jiage;
	}
	public void printTaiInfo(){
		System.out.println("��̨ʽ���ԡ�Ʒ��"+getPinpai()+",�Կ���"+getXianka()+",������"+getShengka()+",�۸�"+getJiage());
	}
}
class Bijiben extends Computer{
	private String pinpai;
	private String xianka;
	private String shengka;
	private float jiage;
	Bijiben(){
		super();
		pinpai="";
		xianka="";
		shengka="";
		jiage=0f;
	}
	Bijiben(String cpu,String zhuban,int yprl,long zhuangsu,String pinpai,String xianka,String shengka,float jiage){
		super.setCpu(cpu);
		super.setZhuban(zhuban);
		super.setYprl(yprl);
		super.setZhuangsu(zhuangsu);
		setPinpai(pinpai);
		setXianka(xianka);
		setShengka(shengka);
		setJiage(jiage);
	}
	public void setPinpai(String pinpai){
		this.pinpai=pinpai;
	}
	public void setXianka(String xianka){
		this.xianka=xianka;
	}
	public void setShengka(String shengka){
		this.shengka=shengka;
	}
	public void setJiage(float jiage){
		this.jiage=jiage;
	}
	public String getPinpai(){
		return pinpai;
	}
	public String getXianka(){
		return xianka;
	}
	public String getShengka(){
		return shengka;
	}
	public float getJiage(){
		return jiage;
	}
	public void printBiInfo(){
		System.out.println("���ʼǱ����ԡ�Ʒ�ƣ�"+getPinpai()+"���Կ���"+getXianka()+"��������"+getShengka()+"���۸�"+getJiage());
	}
}
public class P143{

	public static void main(String[] args) {
		Computer c=new Computer("cpu1","����1",8,3600); 
		c.printComInfo();
		Taishi t=new Taishi("cpu2","����2",18,3630,"Ʒ��2","�Կ�2","����2",18000);
		Bijiben b=new Bijiben("cpu3","����3",16,3630,"Ʒ��3","�Կ�3","����3",28000);
		if(t.getJiage()<b.getJiage()){
			t.printTaiInfo();
			t.printComInfo();
			b.printBiInfo();
			b.printComInfo();
		}else{
			b.printBiInfo();
			b.printComInfo();
			t.printTaiInfo();
			t.printComInfo();
		}
	}

}

