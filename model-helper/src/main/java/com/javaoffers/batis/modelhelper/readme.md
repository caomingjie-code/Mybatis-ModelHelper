```$xslt
               Mybatis                                  java                                     SQL

               integer                          int OR Integer                              INTEGER

               long                              long OR java.lang.Long               BIGINT

               short                             short OR java.lang.Short             SMALLINT

               float                              float OR java.lang.Float               FLOAT

               double                          double OR java.lang.Double        DOUBLE

               big_decimal                  java.math.BigDecimal                  NUMERIC

               character                      java.lang.String                            CHAR(1)

               string                            java.lang.String                             VARCHAR

               byte                              byte OR java.lang.Byte                 TINYINT

               boolean                        boolean OR java.lang.Boolean     BIT

               yes_no                         boolean OR java.lang.Boolean     CHAR(1) ('Y' OR 'N')

               true_false                     boolean OR java.lang.Boolean     CHAR(1) ('Y' OR 'N')

               date                              java.util.Date OR java.sql.Date     DATE

               time                              java.util.Date OR java.sql.Time     TIME

               timestamp                    java.util.Date OR java.sql.TimeStamp    TIMESTAMP

               calendar                       java.util.Calendar                           TIMESTAMP   

               calendar_date              java.util.Calendar                           DTAE

               binary                           byte[]                                              VARBINARY OR BLOB

               text                               java.lang.String                              CLOB

               serializable                   java.io.Seriailzable                         VARBINARY OR BLOB

               clob                              java.sql.Clob                                   CLOB

               blob                              java.sql.Blob                                   BLOB

               class                            java.lang.Class                               VARCHAR                                

               locale                           java.util.Locale                               VARCHAR 

               timezone                      java.util.TimeZone                          VARCHAR  

               currency                       java.util.Currency                           VARCHAR

```
```text

?????? ??? 3.4.5 ?????????MyBatis ???????????? JSR-310?????????????????? API??? ???
???????????????	Java ??????	JDBC ??????
BooleanTypeHandler	java.lang.Boolean, boolean	?????????????????? BOOLEAN
ByteTypeHandler	java.lang.Byte, byte	?????????????????? NUMERIC ??? BYTE
ShortTypeHandler	java.lang.Short, short	?????????????????? NUMERIC ??? SMALLINT
IntegerTypeHandler	java.lang.Integer, int	?????????????????? NUMERIC ??? INTEGER
LongTypeHandler	java.lang.Long, long	?????????????????? NUMERIC ??? BIGINT
FloatTypeHandler	java.lang.Float, float	?????????????????? NUMERIC ??? FLOAT
DoubleTypeHandler	java.lang.Double, double	?????????????????? NUMERIC ??? DOUBLE
BigDecimalTypeHandler	java.math.BigDecimal	?????????????????? NUMERIC ??? DECIMAL
StringTypeHandler	java.lang.String	CHAR, VARCHAR
ClobReaderTypeHandler	java.io.Reader	-
ClobTypeHandler	java.lang.String	CLOB, LONGVARCHAR
NStringTypeHandler	java.lang.String	NVARCHAR, NCHAR
NClobTypeHandler	java.lang.String	NCLOB
BlobInputStreamTypeHandler	java.io.InputStream	-
ByteArrayTypeHandler	byte[]	?????????????????????????????????
BlobTypeHandler	byte[]	BLOB, LONGVARBINARY
DateTypeHandler	java.util.Date	TIMESTAMP
DateOnlyTypeHandler	java.util.Date	DATE
TimeOnlyTypeHandler	java.util.Date	TIME
SqlTimestampTypeHandler	java.sql.Timestamp	TIMESTAMP
SqlDateTypeHandler	java.sql.Date	DATE
SqlTimeTypeHandler	java.sql.Time	TIME
ObjectTypeHandler	Any	OTHER ??????????????????
EnumTypeHandler	Enumeration Type	VARCHAR ?????????????????????????????????????????????????????????????????????????????????????????????
EnumOrdinalTypeHandler	Enumeration Type	??????????????? NUMERIC ??? DOUBLE ???????????????????????????????????????????????????????????????
SqlxmlTypeHandler	java.lang.String	SQLXML
InstantTypeHandler	java.time.Instant	TIMESTAMP
LocalDateTimeTypeHandler	java.time.LocalDateTime	TIMESTAMP
LocalDateTypeHandler	java.time.LocalDate	DATE
LocalTimeTypeHandler	java.time.LocalTime	TIME
OffsetDateTimeTypeHandler	java.time.OffsetDateTime	TIMESTAMP
OffsetTimeTypeHandler	java.time.OffsetTime	TIME
ZonedDateTimeTypeHandler	java.time.ZonedDateTime	TIMESTAMP
YearTypeHandler	java.time.Year	INTEGER
MonthTypeHandler	java.time.Month	INTEGER
YearMonthTypeHandler	java.time.YearMonth	VARCHAR ??? LONGVARCHAR
JapaneseDateTypeHandler	java.time.chrono.JapaneseDate	DATE


```