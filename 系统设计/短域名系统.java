----------------
短域名系统
----------------
	# 长网址的唯一标识，一个唯一的10进制数值
		* murmurhash 算法
		* Snowflake算法
	
	# 压缩
		* 把唯一数值，转换为62进制
		* 26个字母的大小写，加上10个数字
			62 ^ 6 = 56_800_235_584，568亿左右
	
	# 量实在是太大了，可以针对不同的域名，进行压缩
		
	# Redis Bit Map Value值最大 512Mb
		long bits = 1L << 32;       // 4294967296
		long mb = bits / 8 / 1024 / 1024;
		System.out.println(bits + " bit=" + mb + " mb");    // 4294967296bit=512mb