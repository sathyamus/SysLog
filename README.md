# SyslogBasicWriter
Usage: 

java com.snsystems.SyslogBasicWriter 192.168.33.22 514 SathyaMessage

Response:

Adress : /192.168.33.22
Hostname : 192.168.33.22
Port : 192.168.33.22
Message : SathyaMessage

Check the Syslogs

root@kibana:/vagrant# tail -50 /var/log/syslog

Mar  3 03:02:39 SathyaMessage

