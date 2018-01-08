package ifactory.module.statistics;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import ifactory.module.statistics.Sectimesum;
import ifactory.module.statistics.SectimesumExample;

public interface SectimesumMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	long countByExample(SectimesumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	int deleteByExample(SectimesumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	int insert(Sectimesum record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	int insertSelective(Sectimesum record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */List<Sectimesum> selectByExample(SectimesumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	Sectimesum selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */int updateByExampleSelective(@Param("record") Sectimesum record,@Param("example") SectimesumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */int updateByExample(@Param("record") Sectimesum record,@Param("example") SectimesumExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	int updateByPrimaryKeySelective(Sectimesum record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secTimeSum
	 * @mbg.generated  Thu Dec 28 18:56:11 CST 2017
	 */
	int updateByPrimaryKey(Sectimesum record);
}