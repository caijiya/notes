-----------------
普通集群
-----------------
	# 队列分布在集群中的任意节点。但是每个节点都同步 queue 的元数据。
	# 消费队列的时候，如果连接到了“非队列所在节点”，那么当前连接节点会从“队列所在节点” 拉取数据。
	# 基本上就是说，队列都完整放到某个节点上的。节点宕机，队列费不了了。
	
-----------------
镜像集群
-----------------
	# 高可用模式
	# 队列会在多个节点上有“复制节点”，每个节点都包含了完整的数据。
	# 写入消息的时候，会把数据同步到其他节点。


