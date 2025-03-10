/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.waf;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.waf.AWSWAFRegionalClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.services.waf.model.waf_regional.transform.*;

/**
 * Client for accessing WAF Regional. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * This is the <i>AWS WAF Regional API Reference</i> for using AWS WAF with Elastic Load Balancing (ELB) Application
 * Load Balancers. The AWS WAF actions and data types listed in the reference are available for protecting Application
 * Load Balancers. You can use these actions and data types by means of the endpoints listed in <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region">AWS Regions and Endpoints</a>. This guide
 * is for developers who need detailed information about the AWS WAF API actions, data types, and errors. For detailed
 * information about AWS WAF features and an overview of how to use the AWS WAF API, see the <a
 * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSWAFRegionalClient extends AmazonWebServiceClient implements AWSWAFRegional {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSWAFRegional.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "waf-regional";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFReferencedItemException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFReferencedItemException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFLimitsExceededException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFLimitsExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFStaleDataException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFStaleDataException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFNonexistentItemException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFNonexistentItemException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInternalErrorException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFInternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInvalidAccountException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFInvalidAccountException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFDisallowedNameException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFDisallowedNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInvalidOperationException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFInvalidOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFInvalidParameterException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFInvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFNonexistentContainerException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFNonexistentContainerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFNonEmptyEntityException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFNonEmptyEntityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("WAFUnavailableEntityException").withModeledClass(
                                    com.amazonaws.services.waf.model.WAFUnavailableEntityException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.waf.model.AWSWAFException.class));

    /**
     * Constructs a new client to invoke service methods on WAF Regional. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSWAFRegionalClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSWAFRegionalClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on WAF Regional. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to WAF Regional (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSWAFRegionalClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSWAFRegionalClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on WAF Regional using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSWAFRegionalClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSWAFRegionalClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSWAFRegionalClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on WAF Regional using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to WAF Regional (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSWAFRegionalClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFRegionalClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSWAFRegionalClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on WAF Regional using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSWAFRegionalClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSWAFRegionalClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on WAF Regional using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to WAF Regional (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSWAFRegionalClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFRegionalClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSWAFRegionalClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on WAF Regional using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to WAF Regional (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSWAFRegionalClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSWAFRegionalClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSWAFRegionalClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSWAFRegionalClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AWSWAFRegionalClientBuilder builder() {
        return AWSWAFRegionalClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on WAF Regional using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSWAFRegionalClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://waf-regional.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/waf/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/waf/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a web ACL with a resource.
     * </p>
     * 
     * @param associateWebACLRequest
     * @return Result of the AssociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFUnavailableEntityException
     *         The operation failed because the entity referenced is temporarily unavailable. Retry your request.
     * @sample AWSWAFRegional.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/AssociateWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateWebACLResult associateWebACL(AssociateWebACLRequest associateWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWebACLRequest> request = null;
        Response<AssociateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>ByteMatchSet</code>. You then use <a>UpdateByteMatchSet</a> to identify the part of a web request
     * that you want AWS WAF to inspect, such as the values of the <code>User-Agent</code> header or the query string.
     * For example, you can create a <code>ByteMatchSet</code> that matches any requests with <code>User-Agent</code>
     * headers that contain the string <code>BadBot</code>. You can then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateByteMatchSet</a> request to specify the part of the request that you want AWS WAF to inspect
     * (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createByteMatchSetRequest
     * @return Result of the CreateByteMatchSet operation returned by the service.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateByteMatchSetResult createByteMatchSet(CreateByteMatchSetRequest createByteMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateByteMatchSetRequest> request = null;
        Response<CreateByteMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateByteMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createByteMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateByteMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateByteMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <a>IPSet</a>, which you use to specify which web requests you want to allow or block based on the IP
     * addresses that the requests originate from. For example, if you're receiving a lot of requests from one or more
     * individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can create
     * an <code>IPSet</code> that contains those IP addresses and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createIPSetRequest
     * @return Result of the CreateIPSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIPSetRequest> request = null;
        Response<CreateIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIPSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>Rule</code>, which contains the <code>IPSet</code> objects, <code>ByteMatchSet</code> objects,
     * and other predicates that identify the requests that you want to block. If you add more than one predicate to a
     * <code>Rule</code>, a request must match all of the specifications to be allowed or blocked. For example, suppose
     * you add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to blocks requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to specify the predicates that you want to include in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest createRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>SizeConstraintSet</code>. You then use <a>UpdateSizeConstraintSet</a> to identify the part of a
     * web request that you want AWS WAF to check for length, such as the length of the <code>User-Agent</code> header
     * or the length of the query string. For example, you can create a <code>SizeConstraintSet</code> that matches any
     * requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSizeConstraintSet</a> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSizeConstraintSetRequest
     * @return Result of the CreateSizeConstraintSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSizeConstraintSetResult createSizeConstraintSet(CreateSizeConstraintSetRequest createSizeConstraintSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSizeConstraintSetRequest> request = null;
        Response<CreateSizeConstraintSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSizeConstraintSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSizeConstraintSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSizeConstraintSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSizeConstraintSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <a>SqlInjectionMatchSet</a>, which you use to allow, block, or count requests that contain snippets of
     * SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSqlInjectionMatchSet</a> request to specify the parts of web requests in which you want to
     * allow, block, or count malicious SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSqlInjectionMatchSetRequest
     *        A request to create a <a>SqlInjectionMatchSet</a>.
     * @return Result of the CreateSqlInjectionMatchSet operation returned by the service.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSqlInjectionMatchSetResult createSqlInjectionMatchSet(CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSqlInjectionMatchSetRequest> request = null;
        Response<CreateSqlInjectionMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSqlInjectionMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSqlInjectionMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSqlInjectionMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSqlInjectionMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>WebACL</code>, which contains the <code>Rules</code> that identify the CloudFront web requests
     * that you want to allow, block, or count. AWS WAF evaluates <code>Rules</code> in order based on the value of
     * <code>Priority</code> for each <code>Rule</code>.
     * </p>
     * <p>
     * You also specify a default action, either <code>ALLOW</code> or <code>BLOCK</code>. If a web request doesn't
     * match any of the <code>Rules</code> in a <code>WebACL</code>, AWS WAF responds to the request with the default
     * action.
     * </p>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>ByteMatchSet</code> objects and other predicates that you want to include in
     * <code>Rules</code>. For more information, see <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>,
     * <a>CreateIPSet</a>, <a>UpdateIPSet</a>, <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLRequest
     * @return Result of the CreateWebACL operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWebACLResult createWebACL(CreateWebACLRequest createWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(createWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebACLRequest> request = null;
        Response<CreateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <a>XssMatchSet</a>, which you use to allow, block, or count requests that contain cross-site scripting
     * attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateXssMatchSet</a> request to specify the parts of web requests in which you want to allow,
     * block, or count cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createXssMatchSetRequest
     *        A request to create an <a>XssMatchSet</a>.
     * @return Result of the CreateXssMatchSet operation returned by the service.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateXssMatchSetResult createXssMatchSet(CreateXssMatchSetRequest createXssMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateXssMatchSetRequest> request = null;
        Response<CreateXssMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateXssMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createXssMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateXssMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateXssMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes a <a>ByteMatchSet</a>. You can't delete a <code>ByteMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any <a>ByteMatchTuple</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>ByteMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>ByteMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteByteMatchSetRequest
     * @return Result of the DeleteByteMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteByteMatchSetResult deleteByteMatchSet(DeleteByteMatchSetRequest deleteByteMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteByteMatchSetRequest> request = null;
        Response<DeleteByteMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteByteMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteByteMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteByteMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteByteMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes an <a>IPSet</a>. You can't delete an <code>IPSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any IP addresses.
     * </p>
     * <p>
     * If you just want to remove an <code>IPSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>IPSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>IPSet</code> to remove IP address ranges, if any. For more information, see <a>UpdateIPSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteIPSetRequest
     * @return Result of the DeleteIPSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIPSetRequest> request = null;
        Response<DeleteIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIPSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes a <a>Rule</a>. You can't delete a <code>Rule</code> if it's still used in any
     * <code>WebACL</code> objects or if it still includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>Rule</code> from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>Rule</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>Rule</code> to remove predicates, if any. For more information, see <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes a <a>SizeConstraintSet</a>. You can't delete a <code>SizeConstraintSet</code> if it's still
     * used in any <code>Rules</code> or if it still includes any <a>SizeConstraint</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>SizeConstraintSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SizeConstraintSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSizeConstraintSetRequest
     * @return Result of the DeleteSizeConstraintSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSizeConstraintSetResult deleteSizeConstraintSet(DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSizeConstraintSetRequest> request = null;
        Response<DeleteSizeConstraintSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSizeConstraintSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSizeConstraintSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSizeConstraintSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSizeConstraintSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes a <a>SqlInjectionMatchSet</a>. You can't delete a <code>SqlInjectionMatchSet</code> if it's
     * still used in any <code>Rules</code> or if it still contains any <a>SqlInjectionMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>SqlInjectionMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SqlInjectionMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SqlInjectionMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSqlInjectionMatchSetRequest
     *        A request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
     * @return Result of the DeleteSqlInjectionMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSqlInjectionMatchSetResult deleteSqlInjectionMatchSet(DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSqlInjectionMatchSetRequest> request = null;
        Response<DeleteSqlInjectionMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSqlInjectionMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSqlInjectionMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSqlInjectionMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSqlInjectionMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes a <a>WebACL</a>. You can't delete a <code>WebACL</code> if it still contains any
     * <code>Rules</code>.
     * </p>
     * <p>
     * To delete a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>WebACL</code> to remove <code>Rules</code>, if any. For more information, see
     * <a>UpdateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteWebACLRequest
     * @return Result of the DeleteWebACL operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWebACLResult deleteWebACL(DeleteWebACLRequest deleteWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebACLRequest> request = null;
        Response<DeleteWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently deletes an <a>XssMatchSet</a>. You can't delete an <code>XssMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still contains any <a>XssMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove an <code>XssMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>XssMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>XssMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateXssMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteXssMatchSetRequest
     *        A request to delete an <a>XssMatchSet</a> from AWS WAF.
     * @return Result of the DeleteXssMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteXssMatchSetResult deleteXssMatchSet(DeleteXssMatchSetRequest deleteXssMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteXssMatchSetRequest> request = null;
        Response<DeleteXssMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteXssMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteXssMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteXssMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteXssMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a web ACL from the specified resource.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @return Result of the DisassociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DisassociateWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateWebACLResult disassociateWebACL(DisassociateWebACLRequest disassociateWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWebACLRequest> request = null;
        Response<DisassociateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @return Result of the GetByteMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetByteMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetByteMatchSetResult getByteMatchSet(GetByteMatchSetRequest getByteMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetByteMatchSetRequest> request = null;
        Response<GetByteMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetByteMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getByteMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetByteMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetByteMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in
     * the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting
     * requests to AWS WAF.
     * </p>
     * <p>
     * Each create, update, or delete request must use a unique change token. If your application submits a
     * <code>GetChangeToken</code> request and then submits a second <code>GetChangeToken</code> request before
     * submitting a create, update, or delete request, the second <code>GetChangeToken</code> request returns the same
     * value as the first <code>GetChangeToken</code> request.
     * </p>
     * <p>
     * When you use a change token in a create, update, or delete request, the status of the change token changes to
     * <code>PENDING</code>, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use
     * <code>GetChangeTokenStatus</code> to determine the status of your change token.
     * </p>
     * 
     * @param getChangeTokenRequest
     * @return Result of the GetChangeToken operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.GetChangeToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeToken" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetChangeTokenResult getChangeToken(GetChangeTokenRequest getChangeTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getChangeTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangeTokenRequest> request = null;
        Response<GetChangeTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangeTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChangeTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChangeTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChangeTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the status of a <code>ChangeToken</code> that you got by calling <a>GetChangeToken</a>.
     * <code>ChangeTokenStatus</code> is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code>: You requested the change token by calling <code>GetChangeToken</code>, but you haven't
     * used it yet in a call to create, update, or delete an AWS WAF object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: Propagation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeTokenStatusRequest
     * @return Result of the GetChangeTokenStatus operation returned by the service.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.GetChangeTokenStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeTokenStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetChangeTokenStatusResult getChangeTokenStatus(GetChangeTokenStatusRequest getChangeTokenStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getChangeTokenStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangeTokenStatusRequest> request = null;
        Response<GetChangeTokenStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangeTokenStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChangeTokenStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChangeTokenStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChangeTokenStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return Result of the GetIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIPSetRequest> request = null;
        Response<GetIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIPSetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @return Result of the GetRule operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRuleResult getRule(GetRuleRequest getRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRuleRequest> request = null;
        Response<GetRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
     * among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
     * specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which AWS WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @return Result of the GetSampledRequests operation returned by the service.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSampledRequests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSampledRequestsResult getSampledRequests(GetSampledRequestsRequest getSampledRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSampledRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSampledRequestsRequest> request = null;
        Response<GetSampledRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSampledRequestsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSampledRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSampledRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSampledRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @return Result of the GetSizeConstraintSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSizeConstraintSetResult getSizeConstraintSet(GetSizeConstraintSetRequest getSizeConstraintSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSizeConstraintSetRequest> request = null;
        Response<GetSizeConstraintSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSizeConstraintSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSizeConstraintSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSizeConstraintSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSizeConstraintSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest
     *        A request to get a <a>SqlInjectionMatchSet</a>.
     * @return Result of the GetSqlInjectionMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSqlInjectionMatchSetResult getSqlInjectionMatchSet(GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSqlInjectionMatchSetRequest> request = null;
        Response<GetSqlInjectionMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSqlInjectionMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSqlInjectionMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSqlInjectionMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSqlInjectionMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return Result of the GetWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWebACLResult getWebACL(GetWebACLRequest getWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(getWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebACLRequest> request = null;
        Response<GetWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWebACLResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the web ACL for the specified resource.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @return Result of the GetWebACLForResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFUnavailableEntityException
     *         The operation failed because the entity referenced is temporarily unavailable. Retry your request.
     * @sample AWSWAFRegional.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACLForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWebACLForResourceResult getWebACLForResource(GetWebACLForResourceRequest getWebACLForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getWebACLForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebACLForResourceRequest> request = null;
        Response<GetWebACLForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebACLForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWebACLForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWebACLForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWebACLForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest
     *        A request to get an <a>XssMatchSet</a>.
     * @return Result of the GetXssMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetXssMatchSetResult getXssMatchSet(GetXssMatchSetRequest getXssMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetXssMatchSetRequest> request = null;
        Response<GetXssMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetXssMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getXssMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetXssMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetXssMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @return Result of the ListByteMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListByteMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListByteMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListByteMatchSetsResult listByteMatchSets(ListByteMatchSetsRequest listByteMatchSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listByteMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListByteMatchSetsRequest> request = null;
        Response<ListByteMatchSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListByteMatchSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listByteMatchSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListByteMatchSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListByteMatchSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return Result of the ListIPSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIPSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIPSetsRequest> request = null;
        Response<ListIPSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIPSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIPSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIPSetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIPSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of resources associated with the specified web ACL.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @return Result of the ListResourcesForWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListResourcesForWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourcesForWebACLResult listResourcesForWebACL(ListResourcesForWebACLRequest listResourcesForWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourcesForWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourcesForWebACLRequest> request = null;
        Response<ListResourcesForWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourcesForWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourcesForWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourcesForWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResourcesForWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRulesResult listRules(ListRulesRequest listRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @return Result of the ListSizeConstraintSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListSizeConstraintSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSizeConstraintSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSizeConstraintSetsResult listSizeConstraintSets(ListSizeConstraintSetsRequest listSizeConstraintSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSizeConstraintSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSizeConstraintSetsRequest> request = null;
        Response<ListSizeConstraintSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSizeConstraintSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSizeConstraintSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSizeConstraintSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSizeConstraintSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest
     *        A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
     * @return Result of the ListSqlInjectionMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListSqlInjectionMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSqlInjectionMatchSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSqlInjectionMatchSetsResult listSqlInjectionMatchSets(ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSqlInjectionMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSqlInjectionMatchSetsRequest> request = null;
        Response<ListSqlInjectionMatchSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSqlInjectionMatchSetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSqlInjectionMatchSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSqlInjectionMatchSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSqlInjectionMatchSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return Result of the ListWebACLs operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWebACLsResult listWebACLs(ListWebACLsRequest listWebACLsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWebACLsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebACLsRequest> request = null;
        Response<ListWebACLsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebACLsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWebACLsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWebACLsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWebACLsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest
     *        A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
     * @return Result of the ListXssMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListXssMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListXssMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListXssMatchSetsResult listXssMatchSets(ListXssMatchSetsRequest listXssMatchSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listXssMatchSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListXssMatchSetsRequest> request = null;
        Response<ListXssMatchSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListXssMatchSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listXssMatchSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListXssMatchSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListXssMatchSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inserts or deletes <a>ByteMatchTuple</a> objects (filters) in a <a>ByteMatchSet</a>. For each
     * <code>ByteMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a <code>ByteMatchSetUpdate</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more
     * information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see
     * <code>TargetString</code> in the <a>ByteMatchTuple</a> data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Where to look, such as at the beginning or the end of a query string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>ByteMatchSetUpdate</code> object that matches web requests in which
     * <code>User-Agent</code> headers contain the string <code>BadBot</code>. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>ByteMatchSet.</code> For more information, see <a>CreateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateByteMatchSet</code> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateByteMatchSetRequest
     * @return Result of the UpdateByteMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to an <code>IPSet</code>, but the IP address already exists in the
     *         specified <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateByteMatchSetResult updateByteMatchSet(UpdateByteMatchSetRequest updateByteMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateByteMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateByteMatchSetRequest> request = null;
        Response<UpdateByteMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateByteMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateByteMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateByteMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateByteMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inserts or deletes <a>IPSetDescriptor</a> objects in an <code>IPSet</code>. For each <code>IPSetDescriptor</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change an <code>IPSetDescriptor</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address version, <code>IPv4</code> or <code>IPv6</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address in CIDR notation, for example, <code>192.0.2.0/24</code> (for the range of IP addresses from
     * <code>192.0.2.0</code> to <code>192.0.2.255</code>) or <code>192.0.2.44/32</code> (for the individual IP address
     * <code>192.0.2.44</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS WAF supports /8, /16, /24, and /32 IP address ranges for IPv4, and /24, /32, /48, /56, /64 and /128 for IPv6.
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * IPv6 addresses can be represented using any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1111:0000:0000:0000:0000:0000:0000:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111:0:0:0:0:0:0:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::111/128
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use an <code>IPSet</code> to specify which web requests you want to allow or block based on the IP addresses
     * that the requests originated from. For example, if you're receiving a lot of requests from one or a small number
     * of IP addresses and you want to block the requests, you can create an <code>IPSet</code> that specifies those IP
     * addresses, and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>IPSet</code>, you specify the IP addresses that you want to add and/or the IP addresses
     * that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new
     * one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return Result of the UpdateIPSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to an <code>IPSet</code>, but the IP address already exists in the
     *         specified <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIPSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIPSetRequest> request = null;
        Response<UpdateIPSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIPSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIPSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIPSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIPSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a <code>Rule</code>. Each <code>Predicate</code> object identifies
     * a predicate, such as a <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests that you want to
     * allow, block, or count. If you add more than one predicate to a <code>Rule</code>, a request must match all of
     * the specifications to be allowed, blocked, or counted. For example, suppose you add the following to a
     * <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches the value <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to block requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code> <i>and</i> the request must originate from the IP address 192.0.2.44.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the <code>Rule</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to add predicates to the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>ByteMatchSet</code> or <code>IPSet</code> with another, you delete the existing
     * one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to an <code>IPSet</code>, but the IP address already exists in the
     *         specified <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRuleResult updateRule(UpdateRuleRequest updateRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleRequest> request = null;
        Response<UpdateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inserts or deletes <a>SizeConstraint</a> objects (filters) in a <a>SizeConstraintSet</a>. For each
     * <code>SizeConstraint</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a
     * <code>SizeConstraintSetUpdate</code> object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length
     * of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any transformations on the request, such as converting it to lowercase, before checking its
     * length. Note that transformations of the request body are not supported because the AWS resource forwards only
     * the first <code>8192</code> bytes of your request to AWS WAF.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ComparisonOperator</code> used for evaluating the selected part of the request against the specified
     * <code>Size</code>, such as equals, greater than, less than, and so on.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed
     * after applying the transformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>SizeConstraintSetUpdate</code> object that matches web requests in which the
     * length of the <code>User-Agent</code> header is greater than 100 bytes. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>SizeConstraintSet.</code> For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSizeConstraintSet</code> request to specify the part of the request that you want AWS WAF
     * to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSizeConstraintSetRequest
     * @return Result of the UpdateSizeConstraintSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to an <code>IPSet</code>, but the IP address already exists in the
     *         specified <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSizeConstraintSetResult updateSizeConstraintSet(UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSizeConstraintSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSizeConstraintSetRequest> request = null;
        Response<UpdateSizeConstraintSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSizeConstraintSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSizeConstraintSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSizeConstraintSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSizeConstraintSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inserts or deletes <a>SqlInjectionMatchTuple</a> objects (filters) in a <a>SqlInjectionMatchSet</a>. For each
     * <code>SqlInjectionMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change a
     * <code>SqlInjectionMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header, the name of the header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for snippets of malicious SQL code.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>SqlInjectionMatchSet</code> objects to specify which CloudFront requests you want to allow, block,
     * or count. For example, if you're receiving requests that contain snippets of SQL code in the query string and you
     * want to block the requests, you can create a <code>SqlInjectionMatchSet</code> with the applicable settings, and
     * then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSqlInjectionMatchSet</code> request to specify the parts of web requests that you want AWS
     * WAF to inspect for snippets of SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSqlInjectionMatchSetRequest
     *        A request to update a <a>SqlInjectionMatchSet</a>.
     * @return Result of the UpdateSqlInjectionMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to an <code>IPSet</code>, but the IP address already exists in the
     *         specified <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSqlInjectionMatchSetResult updateSqlInjectionMatchSet(UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSqlInjectionMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSqlInjectionMatchSetRequest> request = null;
        Response<UpdateSqlInjectionMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSqlInjectionMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSqlInjectionMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSqlInjectionMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSqlInjectionMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>WebACL</code>. Each <code>Rule</code> identifies web
     * requests that you want to allow, block, or count. When you update a <code>WebACL</code>, you specify the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A default action for the <code>WebACL</code>, either <code>ALLOW</code> or <code>BLOCK</code>. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the <code>Rules</code> in a
     * <code>WebACL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Rules</code> that you want to add and/or delete. If you want to replace one <code>Rule</code> with
     * another, you delete the existing <code>Rule</code> and add the new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each <code>Rule</code>, whether you want AWS WAF to allow requests, block requests, or count requests that
     * match the conditions in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order in which you want AWS WAF to evaluate the <code>Rules</code> in a <code>WebACL</code>. If you add more
     * than one <code>Rule</code> to a <code>WebACL</code>, AWS WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. (The <code>Rule</code> that has the
     * lowest value for <code>Priority</code> is evaluated first.) When a web request matches all of the predicates
     * (such as <code>ByteMatchSets</code> and <code>IPSets</code>) in a <code>Rule</code>, AWS WAF immediately takes
     * the corresponding action, allow or block, and doesn't evaluate the request against the remaining
     * <code>Rules</code> in the <code>WebACL</code>, if any.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in <code>Rules</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <code>WebACL</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateWebACL</code> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return Result of the UpdateWebACL operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to an <code>IPSet</code>, but the IP address already exists in the
     *         specified <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWebACLResult updateWebACL(UpdateWebACLRequest updateWebACLRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWebACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebACLRequest> request = null;
        Response<UpdateWebACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWebACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWebACLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWebACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inserts or deletes <a>XssMatchTuple</a> objects (filters) in an <a>XssMatchSet</a>. For each
     * <code>XssMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change a
     * <code>XssMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header, the name of the header.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for cross-site scripting attacks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>XssMatchSet</code> objects to specify which CloudFront requests you want to allow, block, or count.
     * For example, if you're receiving requests that contain cross-site scripting attacks in the request body and you
     * want to block the requests, you can create an <code>XssMatchSet</code> with the applicable settings, and then
     * configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateXssMatchSet</code> request to specify the parts of web requests that you want AWS WAF to
     * inspect for cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="http://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateXssMatchSetRequest
     *        A request to update an <a>XssMatchSet</a>.
     * @return Result of the UpdateXssMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to an <code>IPSet</code>, but the IP address already exists in the
     *         specified <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, QUERY_STRING, or URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="http://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateXssMatchSetResult updateXssMatchSet(UpdateXssMatchSetRequest updateXssMatchSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateXssMatchSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateXssMatchSetRequest> request = null;
        Response<UpdateXssMatchSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateXssMatchSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateXssMatchSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateXssMatchSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateXssMatchSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
