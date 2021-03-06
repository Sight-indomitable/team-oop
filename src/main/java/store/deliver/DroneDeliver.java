package store.deliver;

public class DroneDeliver extends Deliver
{
    private static int additionalFee = 3000;
    private int battery ;
    public DroneDeliver()
    {
        super();
        battery = 100;
    }

    @Override
    public void deliverStart() throws InterruptedException {
        this.battery -= 10;
        int i = 0;
        System.out.println("배달을 시작합니다 -- 배달 유형 : 드론 --");
        while( i < 4)
        {
            System.out.println("배달중...:" + i);
            Thread.sleep(1000);
            if(i == 1)
                System.out.println("알림 : 배달 도착까지 1분 남았습니다");
            i++;
        }
        System.out.println("배달이 완료되었습니다");

        recharge();
    }

    public static int getAdditionalFee()
    {
        return additionalFee;
    }

    public void recharge()
    {
        this.battery = 100;
    }
}
