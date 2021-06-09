public class SpringnbootApplication {
 private static String[] args;
	private static ConfigurableApplicationContext context;
	public static void main(String[] args){
		SpringnbootApplication. args=args;
		SpringnbootApplication.context=SpringApplication.run(SpringnbootApplication.class, args);
			}
	//重启项目
	   public static void restart() {
	        context.close();
	        SpringnbootApplication.context = SpringApplication.run(SpringnbootApplication.class, args);
	 
	    }
}
