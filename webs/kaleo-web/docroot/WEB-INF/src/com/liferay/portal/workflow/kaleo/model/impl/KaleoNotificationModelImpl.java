/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.User;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoNotification;
import com.liferay.portal.workflow.kaleo.model.KaleoNotificationModel;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the KaleoNotification service. Represents a row in the &quot;KaleoNotification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link KaleoNotificationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoNotificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNotificationImpl
 * @see KaleoNotification
 * @see KaleoNotificationModel
 * @generated
 */
@ProviderType
public class KaleoNotificationModelImpl extends BaseModelImpl<KaleoNotification>
	implements KaleoNotificationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo notification model instance should use the {@link KaleoNotification} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoNotification";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoNotificationId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoClassName", Types.VARCHAR },
			{ "kaleoClassPK", Types.BIGINT },
			{ "kaleoDefinitionId", Types.BIGINT },
			{ "kaleoNodeName", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "executionType", Types.VARCHAR },
			{ "template", Types.CLOB },
			{ "templateLanguage", Types.VARCHAR },
			{ "notificationTypes", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table KaleoNotification (kaleoNotificationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoClassName VARCHAR(200) null,kaleoClassPK LONG,kaleoDefinitionId LONG,kaleoNodeName VARCHAR(200) null,name VARCHAR(200) null,description STRING null,executionType VARCHAR(20) null,template TEXT null,templateLanguage VARCHAR(75) null,notificationTypes VARCHAR(25) null)";
	public static final String TABLE_SQL_DROP = "drop table KaleoNotification";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoNotification.kaleoNotificationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoNotification.kaleoNotificationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotification"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotification"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.workflow.kaleo.model.KaleoNotification"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long EXECUTIONTYPE_COLUMN_BITMASK = 2L;
	public static final long KALEOCLASSNAME_COLUMN_BITMASK = 4L;
	public static final long KALEOCLASSPK_COLUMN_BITMASK = 8L;
	public static final long KALEODEFINITIONID_COLUMN_BITMASK = 16L;
	public static final long KALEONOTIFICATIONID_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoNotification"));

	public KaleoNotificationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _kaleoNotificationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setKaleoNotificationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _kaleoNotificationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return KaleoNotification.class;
	}

	@Override
	public String getModelClassName() {
		return KaleoNotification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoNotificationId", getKaleoNotificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoClassName", getKaleoClassName());
		attributes.put("kaleoClassPK", getKaleoClassPK());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("kaleoNodeName", getKaleoNodeName());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("executionType", getExecutionType());
		attributes.put("template", getTemplate());
		attributes.put("templateLanguage", getTemplateLanguage());
		attributes.put("notificationTypes", getNotificationTypes());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoNotificationId = (Long)attributes.get("kaleoNotificationId");

		if (kaleoNotificationId != null) {
			setKaleoNotificationId(kaleoNotificationId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String kaleoClassName = (String)attributes.get("kaleoClassName");

		if (kaleoClassName != null) {
			setKaleoClassName(kaleoClassName);
		}

		Long kaleoClassPK = (Long)attributes.get("kaleoClassPK");

		if (kaleoClassPK != null) {
			setKaleoClassPK(kaleoClassPK);
		}

		Long kaleoDefinitionId = (Long)attributes.get("kaleoDefinitionId");

		if (kaleoDefinitionId != null) {
			setKaleoDefinitionId(kaleoDefinitionId);
		}

		String kaleoNodeName = (String)attributes.get("kaleoNodeName");

		if (kaleoNodeName != null) {
			setKaleoNodeName(kaleoNodeName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String executionType = (String)attributes.get("executionType");

		if (executionType != null) {
			setExecutionType(executionType);
		}

		String template = (String)attributes.get("template");

		if (template != null) {
			setTemplate(template);
		}

		String templateLanguage = (String)attributes.get("templateLanguage");

		if (templateLanguage != null) {
			setTemplateLanguage(templateLanguage);
		}

		String notificationTypes = (String)attributes.get("notificationTypes");

		if (notificationTypes != null) {
			setNotificationTypes(notificationTypes);
		}
	}

	@Override
	public long getKaleoNotificationId() {
		return _kaleoNotificationId;
	}

	@Override
	public void setKaleoNotificationId(long kaleoNotificationId) {
		_columnBitmask = -1L;

		_kaleoNotificationId = kaleoNotificationId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getKaleoClassName() {
		if (_kaleoClassName == null) {
			return StringPool.BLANK;
		}
		else {
			return _kaleoClassName;
		}
	}

	@Override
	public void setKaleoClassName(String kaleoClassName) {
		_columnBitmask |= KALEOCLASSNAME_COLUMN_BITMASK;

		if (_originalKaleoClassName == null) {
			_originalKaleoClassName = _kaleoClassName;
		}

		_kaleoClassName = kaleoClassName;
	}

	public String getOriginalKaleoClassName() {
		return GetterUtil.getString(_originalKaleoClassName);
	}

	@Override
	public long getKaleoClassPK() {
		return _kaleoClassPK;
	}

	@Override
	public void setKaleoClassPK(long kaleoClassPK) {
		_columnBitmask |= KALEOCLASSPK_COLUMN_BITMASK;

		if (!_setOriginalKaleoClassPK) {
			_setOriginalKaleoClassPK = true;

			_originalKaleoClassPK = _kaleoClassPK;
		}

		_kaleoClassPK = kaleoClassPK;
	}

	public long getOriginalKaleoClassPK() {
		return _originalKaleoClassPK;
	}

	@Override
	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}

	@Override
	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_columnBitmask |= KALEODEFINITIONID_COLUMN_BITMASK;

		if (!_setOriginalKaleoDefinitionId) {
			_setOriginalKaleoDefinitionId = true;

			_originalKaleoDefinitionId = _kaleoDefinitionId;
		}

		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getOriginalKaleoDefinitionId() {
		return _originalKaleoDefinitionId;
	}

	@Override
	public String getKaleoNodeName() {
		if (_kaleoNodeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _kaleoNodeName;
		}
	}

	@Override
	public void setKaleoNodeName(String kaleoNodeName) {
		_kaleoNodeName = kaleoNodeName;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getExecutionType() {
		if (_executionType == null) {
			return StringPool.BLANK;
		}
		else {
			return _executionType;
		}
	}

	@Override
	public void setExecutionType(String executionType) {
		_columnBitmask |= EXECUTIONTYPE_COLUMN_BITMASK;

		if (_originalExecutionType == null) {
			_originalExecutionType = _executionType;
		}

		_executionType = executionType;
	}

	public String getOriginalExecutionType() {
		return GetterUtil.getString(_originalExecutionType);
	}

	@Override
	public String getTemplate() {
		if (_template == null) {
			return StringPool.BLANK;
		}
		else {
			return _template;
		}
	}

	@Override
	public void setTemplate(String template) {
		_template = template;
	}

	@Override
	public String getTemplateLanguage() {
		if (_templateLanguage == null) {
			return StringPool.BLANK;
		}
		else {
			return _templateLanguage;
		}
	}

	@Override
	public void setTemplateLanguage(String templateLanguage) {
		_templateLanguage = templateLanguage;
	}

	@Override
	public String getNotificationTypes() {
		if (_notificationTypes == null) {
			return StringPool.BLANK;
		}
		else {
			return _notificationTypes;
		}
	}

	@Override
	public void setNotificationTypes(String notificationTypes) {
		_notificationTypes = notificationTypes;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			KaleoNotification.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public KaleoNotification toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (KaleoNotification)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		KaleoNotificationImpl kaleoNotificationImpl = new KaleoNotificationImpl();

		kaleoNotificationImpl.setKaleoNotificationId(getKaleoNotificationId());
		kaleoNotificationImpl.setGroupId(getGroupId());
		kaleoNotificationImpl.setCompanyId(getCompanyId());
		kaleoNotificationImpl.setUserId(getUserId());
		kaleoNotificationImpl.setUserName(getUserName());
		kaleoNotificationImpl.setCreateDate(getCreateDate());
		kaleoNotificationImpl.setModifiedDate(getModifiedDate());
		kaleoNotificationImpl.setKaleoClassName(getKaleoClassName());
		kaleoNotificationImpl.setKaleoClassPK(getKaleoClassPK());
		kaleoNotificationImpl.setKaleoDefinitionId(getKaleoDefinitionId());
		kaleoNotificationImpl.setKaleoNodeName(getKaleoNodeName());
		kaleoNotificationImpl.setName(getName());
		kaleoNotificationImpl.setDescription(getDescription());
		kaleoNotificationImpl.setExecutionType(getExecutionType());
		kaleoNotificationImpl.setTemplate(getTemplate());
		kaleoNotificationImpl.setTemplateLanguage(getTemplateLanguage());
		kaleoNotificationImpl.setNotificationTypes(getNotificationTypes());

		kaleoNotificationImpl.resetOriginalValues();

		return kaleoNotificationImpl;
	}

	@Override
	public int compareTo(KaleoNotification kaleoNotification) {
		int value = 0;

		if (getKaleoNotificationId() < kaleoNotification.getKaleoNotificationId()) {
			value = -1;
		}
		else if (getKaleoNotificationId() > kaleoNotification.getKaleoNotificationId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoNotification)) {
			return false;
		}

		KaleoNotification kaleoNotification = (KaleoNotification)obj;

		long primaryKey = kaleoNotification.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		KaleoNotificationModelImpl kaleoNotificationModelImpl = this;

		kaleoNotificationModelImpl._originalCompanyId = kaleoNotificationModelImpl._companyId;

		kaleoNotificationModelImpl._setOriginalCompanyId = false;

		kaleoNotificationModelImpl._originalKaleoClassName = kaleoNotificationModelImpl._kaleoClassName;

		kaleoNotificationModelImpl._originalKaleoClassPK = kaleoNotificationModelImpl._kaleoClassPK;

		kaleoNotificationModelImpl._setOriginalKaleoClassPK = false;

		kaleoNotificationModelImpl._originalKaleoDefinitionId = kaleoNotificationModelImpl._kaleoDefinitionId;

		kaleoNotificationModelImpl._setOriginalKaleoDefinitionId = false;

		kaleoNotificationModelImpl._originalExecutionType = kaleoNotificationModelImpl._executionType;

		kaleoNotificationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<KaleoNotification> toCacheModel() {
		KaleoNotificationCacheModel kaleoNotificationCacheModel = new KaleoNotificationCacheModel();

		kaleoNotificationCacheModel.kaleoNotificationId = getKaleoNotificationId();

		kaleoNotificationCacheModel.groupId = getGroupId();

		kaleoNotificationCacheModel.companyId = getCompanyId();

		kaleoNotificationCacheModel.userId = getUserId();

		kaleoNotificationCacheModel.userName = getUserName();

		String userName = kaleoNotificationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			kaleoNotificationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			kaleoNotificationCacheModel.createDate = createDate.getTime();
		}
		else {
			kaleoNotificationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			kaleoNotificationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			kaleoNotificationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		kaleoNotificationCacheModel.kaleoClassName = getKaleoClassName();

		String kaleoClassName = kaleoNotificationCacheModel.kaleoClassName;

		if ((kaleoClassName != null) && (kaleoClassName.length() == 0)) {
			kaleoNotificationCacheModel.kaleoClassName = null;
		}

		kaleoNotificationCacheModel.kaleoClassPK = getKaleoClassPK();

		kaleoNotificationCacheModel.kaleoDefinitionId = getKaleoDefinitionId();

		kaleoNotificationCacheModel.kaleoNodeName = getKaleoNodeName();

		String kaleoNodeName = kaleoNotificationCacheModel.kaleoNodeName;

		if ((kaleoNodeName != null) && (kaleoNodeName.length() == 0)) {
			kaleoNotificationCacheModel.kaleoNodeName = null;
		}

		kaleoNotificationCacheModel.name = getName();

		String name = kaleoNotificationCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			kaleoNotificationCacheModel.name = null;
		}

		kaleoNotificationCacheModel.description = getDescription();

		String description = kaleoNotificationCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			kaleoNotificationCacheModel.description = null;
		}

		kaleoNotificationCacheModel.executionType = getExecutionType();

		String executionType = kaleoNotificationCacheModel.executionType;

		if ((executionType != null) && (executionType.length() == 0)) {
			kaleoNotificationCacheModel.executionType = null;
		}

		kaleoNotificationCacheModel.template = getTemplate();

		String template = kaleoNotificationCacheModel.template;

		if ((template != null) && (template.length() == 0)) {
			kaleoNotificationCacheModel.template = null;
		}

		kaleoNotificationCacheModel.templateLanguage = getTemplateLanguage();

		String templateLanguage = kaleoNotificationCacheModel.templateLanguage;

		if ((templateLanguage != null) && (templateLanguage.length() == 0)) {
			kaleoNotificationCacheModel.templateLanguage = null;
		}

		kaleoNotificationCacheModel.notificationTypes = getNotificationTypes();

		String notificationTypes = kaleoNotificationCacheModel.notificationTypes;

		if ((notificationTypes != null) && (notificationTypes.length() == 0)) {
			kaleoNotificationCacheModel.notificationTypes = null;
		}

		return kaleoNotificationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{kaleoNotificationId=");
		sb.append(getKaleoNotificationId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", kaleoClassName=");
		sb.append(getKaleoClassName());
		sb.append(", kaleoClassPK=");
		sb.append(getKaleoClassPK());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoNodeName=");
		sb.append(getKaleoNodeName());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", executionType=");
		sb.append(getExecutionType());
		sb.append(", template=");
		sb.append(getTemplate());
		sb.append(", templateLanguage=");
		sb.append(getTemplateLanguage());
		sb.append(", notificationTypes=");
		sb.append(getNotificationTypes());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoNotification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoNotificationId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNotificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoClassName</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoClassPK</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeName</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>executionType</column-name><column-value><![CDATA[");
		sb.append(getExecutionType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>template</column-name><column-value><![CDATA[");
		sb.append(getTemplate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>templateLanguage</column-name><column-value><![CDATA[");
		sb.append(getTemplateLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notificationTypes</column-name><column-value><![CDATA[");
		sb.append(getNotificationTypes());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = KaleoNotification.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			KaleoNotification.class
		};
	private long _kaleoNotificationId;
	private long _groupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _kaleoClassName;
	private String _originalKaleoClassName;
	private long _kaleoClassPK;
	private long _originalKaleoClassPK;
	private boolean _setOriginalKaleoClassPK;
	private long _kaleoDefinitionId;
	private long _originalKaleoDefinitionId;
	private boolean _setOriginalKaleoDefinitionId;
	private String _kaleoNodeName;
	private String _name;
	private String _description;
	private String _executionType;
	private String _originalExecutionType;
	private String _template;
	private String _templateLanguage;
	private String _notificationTypes;
	private long _columnBitmask;
	private KaleoNotification _escapedModel;
}